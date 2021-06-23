import { LocationChangeEvent } from '@angular/common';
import { Component, OnInit, Input } from '@angular/core';
import { Router } from '@angular/router';
import { CellService } from '../cell.service';
export interface Cell{
  id: number;
  cellNumber:number;
  spots:number;
}
@Component({
  selector: 'app-cell',
  templateUrl: './cell.component.html',
  styleUrls: ['./cell.component.css']
})

export class CellComponent implements OnInit {
  cells:Cell[]=[];

  constructor(private cellService:CellService, private router:Router) { }

  ngOnInit(): void {
    this.getCells();
  }
  getCells(){
    this.cellService.getCells().subscribe(res=>this.cells=res);
  }
  addCell(){
    this.router.navigateByUrl('cells/new'); //bez rootingu w approuting
  }
}
