import { Injectable } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

import { IProduct, NewProduct } from '../product.model';

/**
 * A partial Type with required key is used as form input.
 */
type PartialWithRequiredKeyOf<T extends { id: unknown }> = Partial<Omit<T, 'id'>> & { id: T['id'] };

/**
 * Type for createFormGroup and resetForm argument.
 * It accepts IProduct for edit and NewProductFormGroupInput for create.
 */
type ProductFormGroupInput = IProduct | PartialWithRequiredKeyOf<NewProduct>;

type ProductFormDefaults = Pick<NewProduct, 'id'>;

type ProductFormGroupContent = {
  id: FormControl<IProduct['id'] | NewProduct['id']>;
  code: FormControl<IProduct['code']>;
  region: FormControl<IProduct['region']>;
  mounth: FormControl<IProduct['mounth']>;
  name: FormControl<IProduct['name']>;
  type: FormControl<IProduct['type']>;
  year: FormControl<IProduct['year']>;
  value: FormControl<IProduct['value']>;
  currency: FormControl<IProduct['currency']>;
  attribute: FormControl<IProduct['attribute']>;
};

export type ProductFormGroup = FormGroup<ProductFormGroupContent>;

@Injectable({ providedIn: 'root' })
export class ProductFormService {
  createProductFormGroup(product: ProductFormGroupInput = { id: null }): ProductFormGroup {
    const productRawValue = {
      ...this.getFormDefaults(),
      ...product,
    };
    return new FormGroup<ProductFormGroupContent>({
      id: new FormControl(
        { value: productRawValue.id, disabled: true },
        {
          nonNullable: true,
          validators: [Validators.required],
        }
      ),
      code: new FormControl(productRawValue.code),
      region: new FormControl(productRawValue.region),
      mounth: new FormControl(productRawValue.mounth),
      name: new FormControl(productRawValue.name),
      type: new FormControl(productRawValue.type),
      year: new FormControl(productRawValue.year),
      value: new FormControl(productRawValue.value),
      currency: new FormControl(productRawValue.currency),
      attribute: new FormControl(productRawValue.attribute),
    });
  }

  getProduct(form: ProductFormGroup): IProduct | NewProduct {
    return form.getRawValue() as IProduct | NewProduct;
  }

  resetForm(form: ProductFormGroup, product: ProductFormGroupInput): void {
    const productRawValue = { ...this.getFormDefaults(), ...product };
    form.reset(
      {
        ...productRawValue,
        id: { value: productRawValue.id, disabled: true },
      } as any /* cast to workaround https://github.com/angular/angular/issues/46458 */
    );
  }

  private getFormDefaults(): ProductFormDefaults {
    return {
      id: null,
    };
  }
}
