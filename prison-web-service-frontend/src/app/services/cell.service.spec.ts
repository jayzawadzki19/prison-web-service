import { TestBed } from '@angular/core/testing';

import { CellService } from './cell.service';

describe('CellService', () => {
  let service: CellService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CellService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
