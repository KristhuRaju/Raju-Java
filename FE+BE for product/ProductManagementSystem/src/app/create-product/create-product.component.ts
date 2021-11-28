import { ProductService } from '../product.service';
import { Product } from '../product';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.css']
})
export class CreateProductComponent implements OnInit {

  product: Product = new Product();
  submitted = false;

  constructor(private productService: ProductService,
    private router: Router) { }

  ngOnInit() {
  }

  newProduct(): void {
    this.submitted = false;
    this.product = new Product();
  }

  save() {

  this.productService.createProduct(this.product).subscribe((data: any) => {
      //  this.product = new Product();
    //  this.gotoList();
    }, 
    (    error: any) => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();    // this method is called on click submit
  }

  gotoList() {
    this.router.navigate(['/products']);
  }
}
