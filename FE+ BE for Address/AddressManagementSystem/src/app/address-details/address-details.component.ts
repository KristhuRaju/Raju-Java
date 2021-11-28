import {Address } from '../address';
import { Component, OnInit, Input } from '@angular/core';
import { AddressService } from '../address.service';
import { AddressListComponent } from '../address-list/address-list.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-address-details',
  templateUrl: './address-details.component.html',
  styleUrls: ['./address-details.component.css']
})
export class AddressDetailsComponent implements OnInit {

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

  list(){
    this.router.navigate(['addresss']);
  }
}

