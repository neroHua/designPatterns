package chapter03.factoryMethod.creator;

import chapter03.factoryMethod.product.DefaultProduct;
import chapter03.factoryMethod.product.Product;

public class DefaultCreator extends Creator {

    @Override
    public Product factoryMethod() {
        return new DefaultProduct();
    }

}
