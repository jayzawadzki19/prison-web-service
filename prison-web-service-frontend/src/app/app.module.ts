import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CellComponent } from './components/cell/cell.component';
import { MeetingComponent } from './components/meeting/meeting.component';
import { PrisonerComponent } from './components/prisoner/prisoner.component';
import { PrisonofficerComponent } from './components/prisonofficer/prisonofficer.component';
import { MeetingroomComponent } from './components/meetingroom/meetingroom.component';

@NgModule({
  declarations: [
    AppComponent,
    CellComponent,
    MeetingComponent,
    PrisonerComponent,
    PrisonofficerComponent,
    MeetingroomComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }