import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators, ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { MeetingService } from 'src/app/services/meeting.service';
import { Meeting } from '../meeting/meeting.component';

@Component({
  selector: 'app-meeting-form',
  templateUrl: './meeting-form.component.html',
  styleUrls: ['./meeting-form.component.css']
})


export class MeetingFormComponent implements OnInit {
  form!: FormGroup;

  constructor(private meetingService: MeetingService, private router: Router, private fb: FormBuilder, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.utworzFormularz();
  }

  private utworzFormularz(meeting?: Meeting) {
    this.form = this.fb.group({
      visitorData: new FormControl(meeting?.visitorData, [Validators.required, Validators.minLength(3), Validators.maxLength(100)]),
      meetingStart: new FormControl(meeting?.meetingStart, []),
      meetingEnd: new FormControl(meeting?.meetingEnd, []),
      prisonerId: new FormControl(meeting?.prisonerId, []),
      prisonOfficerId: new FormControl(meeting?.prisonOfficerId, []),
      meetingRoomId: new FormControl(meeting?.meetingRoomId, []),
      isFinished: new FormControl(meeting?.isFinished, [])
    });

    this.form.controls['visitorData'].valueChanges.subscribe(newVisitorData => {
      console.log('Dane osoby odwiedzającej: ' + newVisitorData);
    });

    this.form.controls['meetingStart'].valueChanges.subscribe(newMeetingStart => {
      console.log('Początek spotkania: ' + newMeetingStart);
      this.form.controls['meetingEnd'].setValue(newMeetingStart + 2)
    });

    this.form.controls['meetingEnd'].valueChanges.subscribe(newMeetingEnd => {
      console.log('Koniec spotkania: ' + newMeetingEnd);
    });

    this.form.controls['prisonerId'].valueChanges.subscribe(prisonerId => {
      console.log('Id więźnia: ' + prisonerId);
    });

    this.form.controls['prisonOfficerId'].valueChanges.subscribe(prisonOfficerId => {
      console.log('Id pracownika: ' + prisonOfficerId);
    });

    this.form.controls['meetingRoomId'].valueChanges.subscribe(meetingRoomId => {
      console.log('Id pokoju: ' + meetingRoomId);
    });

    this.form.controls['isFinished'].setValue(false);
  }

  onSubmit() {
    this.meetingService.addMeeting(this.form.value).subscribe(res => this.router.navigateByUrl('meetings/all'));
  }
}
