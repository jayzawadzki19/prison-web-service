import { TestBed } from '@angular/core/testing';

import { PrisonerService } from './prisoner.service';

describe('PrisonerService', () => {
  let service: PrisonerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PrisonerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
