import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Meetingroom } from '../components/meetingroom/meetingroom.component';

@Injectable({
  providedIn: 'root'
})
export class MeetingroomService {

  constructor(private http:HttpClient) { }

  getMeetingRooms():Observable<Meetingroom[]>{
    return this.http.get<Meetingroom[]>('http://localhost:8080/meetingrooms/all');
  }
  getMeetingRoomsById(id:number):Observable<Meetingroom>{
    return this.http.get<Meetingroom>('http://localhost:8080/meetingrooms/byId'+id)
  }
}
