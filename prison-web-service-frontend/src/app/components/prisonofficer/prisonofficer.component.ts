import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PrisonofficerService } from 'src/app/services/prisonofficer.service';
import { Meeting } from '../meeting/meeting.component';
export interface PrisonOfficer{
  id:number;
  name:string;
  surname:string;
  meetings:Meeting[];
}
@Component({
  selector: 'app-prisonofficer',
  templateUrl: './prisonofficer.component.html',
  styleUrls: ['./prisonofficer.component.css']
})
export class PrisonofficerComponent implements OnInit {
prisonOfficers:PrisonOfficer[]=[];
  constructor(private prisonOfficerService:PrisonofficerService, private router:Router) { }

  ngOnInit(): void {
    this.getPrisonOfficers();
  }
getPrisonOfficers(){
return this.prisonOfficerService.getPrisonOfficers().subscribe(res=>this.prisonOfficers=res);
}
}
