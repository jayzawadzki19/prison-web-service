import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CellComponent } from './cell/cell.component';
import { MeetingComponent } from './meeting/meeting.component';
import { PrisonerComponent } from './prisoner/prisoner.component';
import { PrisonofficerComponent } from './prisonofficer/prisonofficer.component';
import { MeetingroomComponent } from './meetingroom/meetingroom.component';

@NgModule({
  declarations: [
    AppComponent,
    CellComponent,
    MeetingComponent,
    PrisonerComponent,
    PrisonofficerComponent,
    MeetingroomComponent
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