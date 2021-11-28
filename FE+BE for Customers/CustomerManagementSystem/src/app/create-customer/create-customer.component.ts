import { CustomerService } from '../customer.service';
import { Customer } from '../customer';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  customer: Customer = new Customer();
  submitted = false;

  constructor(private customerService: CustomerService,
    private router: Router) { }

  ngOnInit() {
  }

  newOrder(): void {
    this.submitted = false;
    this.customer = new Customer();
  }

  save() {

  this.customerService.createCustomer(this.customer).subscribe((data: any) => {
      //  this.customer = new Customer();
    //  this.gotoList();
    }, 
    (    error: any) => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();    // this method is called on click submit
  }

  gotoList() {
    this.router.navigate(['/customers']);
  }
}
