package chapter03;

import chapter03.BaseCar;

public class ACarFactory extends CarFactory {

    @Override
    public ABaseCar createCar1(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter03.";
        return (ABaseCar)Class.forName(PACKAGE_PATH + carType).newInstance();
    }

    @Override
    public <T extends BaseCar> T createCar2(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

}
