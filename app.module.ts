import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { CreateEmployeeComponent } from "./create-employee/create-employee.component";
import { EmployeeDetailsComponent } from "./employee-details/employee-details.component";
import { EmployeeListComponent } from "./employee-list/employee-list.component";
import { UpdateEmployeeComponent } from "./update-employee/update-employee.component";



@NgModule({
  declarations: [
    AppComponent,
    CreateEmployeeComponent,
    UpdateEmployeeComponent,
    EmployeeDetailsComponent,
    EmployeeListComponent,
  
  ],
  imports: [
    BrowserModule,
    //AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
