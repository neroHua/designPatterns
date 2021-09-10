package chapter03.factoryMethod.creator;

import chapter03.factoryMethod.product.Product;

public abstract class Creator {

    private Product product;

    public Creator() {
        product = factoryMethod();
    }

    public abstract Product factoryMethod();

    public void printProduct() {
        System.out.println(product);
    }

    public void useProduct() {
    }

}
