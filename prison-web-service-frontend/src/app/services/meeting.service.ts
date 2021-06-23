import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Meeting, MeetingComponent } from '../components/meeting/meeting.component';
@Injectable({
  providedIn: 'root'
})
export class MeetingService {

  constructor(private http:HttpClient) { }

  getMeetings():Observable<Meeting[]>{
    return this.http.get<Meeting[]>('http://localhost:8080/meetings/all');
  }
  getMeeting(id:number):Observable<Meeting>{
    return this.http.get<Meeting>('http://localhost:8080/meetings/byId'+id);
  }
  getMeetingByPrisoner(idPrisoner:number):Observable<Meeting[]>{
    return this.http.get<Meeting[]>('http://localhost:8080/meetings/byPrisoner'+idPrisoner);
  }
  getMeetingByPrisonOfficer(idPrisonOfficer:number):Observable<Meeting[]>{
    return this.http.get<Meeting[]>('http://localhost:8080/meetings/byPrisonerOfficer'+idPrisonOfficer);
  }
  getMeetingByRoom(id:number):Observable<Meeting[]>{
    return this.http.get<Meeting[]>('http://localhost:8080/meetings/roomId'+id);
  }
  addMeeting(meeting:Meeting):Observable<Meeting>{
    return this.http.post<Meeting>('http://localhost:8080/meetings/new',meeting);
  }
}
