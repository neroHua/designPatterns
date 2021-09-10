package chapter03.factoryMethod.creator;

import chapter03.factoryMethod.product.Product;
import chapter03.factoryMethod.product.ProductA;

public class CreatorA extends Creator {

    @Override
    public Product factoryMethod() {
        return new ProductA();
    }

}
