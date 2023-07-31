import { IProduct, NewProduct } from './product.model';

export const sampleWithRequiredData: IProduct = {
  id: 77672,
};

export const sampleWithPartialData: IProduct = {
  id: 23352,
  mounth: 'Concrete Interface',
  name: 'recontextualize',
  type: 'Health calculate neural',
  value: 'District',
  attribute: 'Garden Customer-focused Świętokrzyskie',
};

export const sampleWithFullData: IProduct = {
  id: 13074,
  code: 'Incredible',
  region: 'Dynamic encompassing vertical',
  mounth: 'circuit',
  name: 'copying Tuna Marketing',
  type: 'Multi-lateral',
  year: 'deposit Loaf withdrawal',
  value: 'Peru Universal',
  currency: 'alarm compressing',
  attribute: 'compress Franc',
};

export const sampleWithNewData: NewProduct = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
