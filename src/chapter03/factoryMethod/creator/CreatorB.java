package chapter03.factoryMethod.creator;

import chapter03.factoryMethod.product.Product;
import chapter03.factoryMethod.product.ProductB;

public class CreatorB extends Creator {

    @Override
    public Product factoryMethod() {
        return new ProductB();
    }

}
