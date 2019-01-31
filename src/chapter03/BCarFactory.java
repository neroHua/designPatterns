package chapter03;

import chapter03.BaseCar;

public class BCarFactory extends CarFactory {

    @Override
    public BBaseCar createCar1(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter03.";
        return (BBaseCar)Class.forName(PACKAGE_PATH + carType).newInstance();
    }

    @Override
    public <T extends BaseCar> T createCar2(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

}
