import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Cell} from '../components/cell/cell.component';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CellService {

  constructor(private http:HttpClient) {}

  getCells():Observable<Cell[]>{
    return this.http.get<Cell[]>('http://localhost:8080/cells/getAll');
  }
  getCell(id:number):Observable<Cell>{
    return this.http.get<Cell>('http://localhost:8080/cells/byId'+id);
  }
  getCellByCellNumber(cellNumber:number){
    return this.http.get<Cell>('https://localhost:8080/cells/byCellNumber'+cellNumber);
  }
  getCellBySpots(spots:number){
    return this.http.get<Cell>('http://localhost:8080/cells/bySpots'+spots);
  }
  addCell(cell:Cell):Observable<Cell>{
    return this.http.post<Cell>('http://localhost:8080/cells/new',cell);
  }
 // deletecell(cell:Cell):Observable<Cell>{
  //  return ;
 // }

}
