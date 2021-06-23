import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CellComponent } from './components/cell/cell.component';
import { MeetingComponent } from './components/meeting/meeting.component';
import { MeetingroomComponent } from './components/meetingroom/meetingroom.component';
import { PrisonerComponent } from './components/prisoner/prisoner.component';
import { PrisonofficerComponent } from './components/prisonofficer/prisonofficer.component';

const routes: Routes = [
  { path: '', component: AppComponent},
  { path: 'cells', children:
    [
      {path: 'all', component: CellComponent}
    ] },
  {path:'meetings',children:[
    {path:'all',component:MeetingComponent}
  ]},
  {path:'meetingsroom',children:[
    {path:'all',component:MeetingroomComponent}
  ]},
  {path:'prisoners',children:[
    {path:'all',component:PrisonerComponent}
  ]},
  {path:'prisonofficers',children:[
    {path:'all',component:PrisonofficerComponent}
  ]},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
