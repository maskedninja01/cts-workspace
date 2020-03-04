import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyerSignUpComponent } from './buyer-sign-up.component';

describe('BuyerSignUpComponent', () => {
  let component: BuyerSignUpComponent;
  let fixture: ComponentFixture<BuyerSignUpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuyerSignUpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuyerSignUpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
