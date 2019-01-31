package chapter04;

import chapter04.BaseCar;

public class ACarFactory extends CarFactory {

    @Override
    public ABaseCar createCar1(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter04.";
        return (ABaseCar)Class.forName(PACKAGE_PATH + carType).newInstance();
    }

    @Override
    public <T extends BaseCar> T createCar2(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

    @Override
    public ABaseWheel createWheel1(String wheelType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter04.";
        return (ABaseWheel)Class.forName(PACKAGE_PATH + wheelType).newInstance();
    }

    @Override
    public <T extends BaseWheel> T createWheel2(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

}
