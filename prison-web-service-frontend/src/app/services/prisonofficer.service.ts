import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PrisonOfficer } from '../components/prisonofficer/prisonofficer.component';

@Injectable({
  providedIn: 'root'
})
export class PrisonofficerService {

  constructor(private http:HttpClient) { }
  getPrisonOfficers():Observable<PrisonOfficer[]>{
    return this.http.get<PrisonOfficer[]>('http://localhost:8080/PrisonOfficers/all');
  }
  
  getPrisonOfficer(id:number):Observable<PrisonOfficer>{
    return this.http.get<PrisonOfficer>('http://localhost:8080/PrisonOfficers/byId'+id);
  }
  addPrisonOfficer(prisonOfficer:PrisonOfficer):Observable<PrisonOfficer>{
    return this.http.post<PrisonOfficer>('http://localhost:8080/prisoners/new',prisonOfficer);
  }
}
