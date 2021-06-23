import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrisonofficerComponent } from './prisonofficer.component';

describe('PrisonofficerComponent', () => {
  let component: PrisonofficerComponent;
  let fixture: ComponentFixture<PrisonofficerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrisonofficerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PrisonofficerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
