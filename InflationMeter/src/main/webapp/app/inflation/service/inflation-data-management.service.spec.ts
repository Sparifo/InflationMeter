import { TestBed } from '@angular/core/testing';

import { InflationDataManagementService } from './inflation-data-management.service';

describe('InflationDataManagementService', () => {
  let service: InflationDataManagementService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InflationDataManagementService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
