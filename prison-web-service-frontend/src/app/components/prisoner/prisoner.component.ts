import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PrisonerService } from 'src/app/services/prisoner.service';
import { Meeting } from '../meeting/meeting.component';
export interface Prisoner{
  id:number;
  name:string;
  surname:string;
  judgement:string;
  cellId:number;
  meetings:Meeting[];

}
@Component({
  selector: 'app-prisoner',
  templateUrl: './prisoner.component.html',
  styleUrls: ['./prisoner.component.css']
})
export class PrisonerComponent implements OnInit {
prisoners:Prisoner[]=[];
  constructor(private prisonerService:PrisonerService, private router:Router) { }

  ngOnInit(): void {
    this.getPrisoners();
  }
getPrisoners(){
  return this.prisonerService.getPrisoners().subscribe(res=>this.prisoners=res);
}
}
