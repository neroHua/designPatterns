package chapter03.factoryMethod;

import chapter03.factoryMethod.creator.Creator;
import chapter03.factoryMethod.creator.DefaultCreator;

public class Client {

    public static void main(String[] args) {
        Creator creator = new DefaultCreator();

        creator.printProduct();
        creator.useProduct();
    }

}
