export interface IProduct {
  id: number;
  code?: string | null;
  region?: string | null;
  mounth?: string | null;
  name?: string | null;
  type?: string | null;
  year?: string | null;
  value?: string | null;
  currency?: string | null;
  attribute?: string | null;
}

export type NewProduct = Omit<IProduct, 'id'> & { id: null };
