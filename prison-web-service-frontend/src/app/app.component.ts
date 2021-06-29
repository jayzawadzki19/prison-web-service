import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CellService } from './services/cell.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private router: Router) {}

  title = 'prison-web-service-frontend';
}
