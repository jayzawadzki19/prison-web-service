import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Prisoner } from '../components/prisoner/prisoner.component';

@Injectable({
  providedIn: 'root'
})
export class PrisonerService {

  constructor(private http:HttpClient) { }

  getPrisoners():Observable<Prisoner[]>{
    return this.http.get<Prisoner[]>('http://localhost:8080/prisoners/all');
  }
  getPrisoner(id:number):Observable<Prisoner>{
    return this.http.get<Prisoner>('http://localhost:8080/prisoners/byId'+id);
  }
  addPrisoner(prisoner:Prisoner):Observable<Prisoner>{
    return this.http.post<Prisoner>('http://localhost:8080/prisoners/new',prisoner);
  }
}
