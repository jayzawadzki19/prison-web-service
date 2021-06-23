import { TestBed } from '@angular/core/testing';

import { PrisonofficerService } from './prisonofficer.service';

describe('PrisonofficerService', () => {
  let service: PrisonofficerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PrisonofficerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
