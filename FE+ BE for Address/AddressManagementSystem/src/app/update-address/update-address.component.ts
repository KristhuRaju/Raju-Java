import { Component, OnInit } from '@angular/core';
import { Address } from '../address';
import { ActivatedRoute, Router } from '@angular/router';
import { AddressService } from '../address.service';

@Component({
  selector: 'app-update-address',
  templateUrl: './update-address.component.html',
  styleUrls: ['./update-address.component.css']
})
export class UpdateAddressComponent implements OnInit {

  id: number;
  address: Address; 

  constructor(private route: ActivatedRoute,private router: Router,
    private addressService: AddressService) { }

  ngOnInit() {
    this.address = new Address();

    this.id = this.route.snapshot.params['id'];
    
    this.addressService.getAddress(this.id)
      .subscribe((data: any) => {
        console.log(data)
        this.address = data;
      }, (error: any) => console.log(error));
  }

  updateAddress() {
    this.addressService.updateAddress(this.id, this.address)
      .subscribe((data: any) => {
        console.log(data);
        this.address = new Address();
        this.gotoList();
      }, (error: any) => console.log(error));
  }

  onSubmit() {
    this.updateAddress();    
  }

  gotoList() {
    this.router.navigate(['/addresss']);
  }
}