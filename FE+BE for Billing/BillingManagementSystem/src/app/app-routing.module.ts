import { BillingDetailsComponent } from './billing-details/billing-details.component';
import { CreateBillingComponent } from './create-billing/create-billing.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BillingListComponent } from './billing-list/billing-list.component';
import { UpdateBillingComponent } from './update-billing/update-billing.component';

const routes: Routes = [
  { path: '', redirectTo: 'order', pathMatch: 'full' },
  { path: 'billings', component: BillingListComponent },
  { path: 'add', component: CreateBillingComponent },
  { path: 'update/:id', component: UpdateBillingComponent },
  { path: 'details/:id', component: BillingDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
