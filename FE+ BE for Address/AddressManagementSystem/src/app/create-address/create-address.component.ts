import { AddressService } from '../address.service';
import { Address } from '../address';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-address',
  templateUrl: './create-address.component.html',
  styleUrls: ['./create-address.component.css']
})
export class CreateAddressComponent implements OnInit {

  address: Address = new Address();
  submitted = false;

  constructor(private addressService: AddressService,
    private router: Router) { }

  ngOnInit() {
  }

  newOrder(): void {
    this.submitted = false;
    this.address = new Address();
  }

  save() {

  this.addressService.createAddress(this.address).subscribe((data: any) => {
      //  this.address = new Address();
    //  this.gotoList();
    }, 
    (    error: any) => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();    // this method is called on click submit
  }

  gotoList() {
    this.router.navigate(['/addresss']);
  }
}
