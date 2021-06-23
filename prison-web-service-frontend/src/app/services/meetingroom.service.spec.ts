import { TestBed } from '@angular/core/testing';

import { MeetingroomService } from './meetingroom.service';

describe('MeetingroomService', () => {
  let service: MeetingroomService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MeetingroomService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
