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
import { MeetingFormComponent } from './components/meeting-form/meeting-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    CellComponent,
    MeetingComponent,
    PrisonerComponent,
    PrisonofficerComponent,
    MeetingroomComponent,
    MeetingFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }