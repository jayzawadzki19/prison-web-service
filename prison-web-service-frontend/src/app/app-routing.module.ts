import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CellComponent } from './components/cell/cell.component';
import { HomeComponent } from './components/home/home.component';
import { MeetingFormComponent } from './components/meeting-form/meeting-form.component';
import { MeetingComponent } from './components/meeting/meeting.component';
import { MeetingroomComponent } from './components/meetingroom/meetingroom.component';
import { PrisonerComponent } from './components/prisoner/prisoner.component';
import { PrisonofficerComponent } from './components/prisonofficer/prisonofficer.component';

const routes: Routes = [
  { path: '', component: HomeComponent},
  { path: 'cells', children:
    [
      { path: 'all', component: CellComponent}
    ]},
  { path:'meetings', children:
    [
      { path: 'all', component: MeetingComponent},
      { path: 'new', component: MeetingFormComponent}
    ]},
  { path:'meetingrooms', children:
    [
      { path:'all', component: MeetingroomComponent}
    ]},
  { path:'prisoners', children:
    [
      { path:'all', component: PrisonerComponent}
    ]},
  { path:'prisonofficers', children:
    [
      { path:'all', component: PrisonofficerComponent}
    ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
