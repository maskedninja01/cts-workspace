import { TestBed } from '@angular/core/testing';

import { ArthService } from './arth.service';

describe('ArthService', () => {
  let service : ArthService;
  beforeEach(() => TestBed.configureTestingModule({}));

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.get(ArthService);
  });

  it('should be created', () => {
    const service: ArthService = TestBed.get(ArthService);
    expect(service).toBeTruthy();
  });

  it('should return a positive value when add is supplied with two positive operands',()=>{
    let result = service.add(10,2);
    expect(result).toBe(12);
  });

  it('should return negative when negative values are supplied',()=>{
    let result = service.add(-10,-2);
    expect(result).toBe(-12);
  })
});
