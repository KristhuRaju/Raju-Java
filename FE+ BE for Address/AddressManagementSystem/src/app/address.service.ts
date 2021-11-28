import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddressService {

  private baseUrl = 'http://localhost:8070/api/v1/addresss';

  constructor(private http: HttpClient) { }

  getAddress(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
      // calling the backend api create employee method from here
  createAddress(address: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, address);
  }

  updateAddress(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteAddress(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }
      //this method is to get list of all values
  getAddresssList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
