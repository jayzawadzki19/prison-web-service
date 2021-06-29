import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MeetingService } from 'src/app/services/meeting.service';
export interface Meeting {
  id:number;
  visitorData:string;
  meetingStart:string;
  meetingEnd:string;
  prisonerId:number;
  prisonOfficerId:number;
  meetingRoomId:number;
  isFinished:boolean;
}
@Component({
  selector: 'app-meeting',
  templateUrl: './meeting.component.html',
  styleUrls: ['./meeting.component.css']
})
export class MeetingComponent implements OnInit {
meetings:Meeting[]=[]
  constructor(private meetingService: MeetingService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.getMeetings();
  }

  getMeetings(){
    this.meetingService.getMeetings().subscribe(res=>this.meetings=res);
  }

}
