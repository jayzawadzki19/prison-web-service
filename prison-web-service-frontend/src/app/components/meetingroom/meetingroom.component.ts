import { Component, OnInit } from '@angular/core';
import { Meeting } from '../meeting/meeting.component';
import { MeetingroomService } from 'src/app/services/meetingroom.service';
import { Router } from '@angular/router';
export interface Meetingroom{
id:number;
roomNumber:number;
spots:number;
meetings:Meeting[];
}
@Component({
  selector: 'app-meetingroom',
  templateUrl: './meetingroom.component.html',
  styleUrls: ['./meetingroom.component.css']
})
export class MeetingroomComponent implements OnInit {
meetingrooms:Meetingroom[]=[];
  constructor(private meetingroomService:MeetingroomService, private router:Router) { }

  ngOnInit(): void {
  }

}
