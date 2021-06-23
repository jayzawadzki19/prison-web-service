import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Meetingroom } from '../components/meetingroom/meetingroom.component';

@Injectable({
  providedIn: 'root'
})
export class MeetingroomService {

  constructor(private http:HttpClient) { }

  getMeetingrooms(id:number):Observable<Meetingroom>{
    //w javie getall dodać
    return this.http.get<Meetingroom>('http://localhost:8080/meetingrooms/byId'+id)
  }
}
