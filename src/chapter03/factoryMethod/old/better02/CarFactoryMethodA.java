package chapter03.factoryMethod.old.better02;

public class CarFactoryMethodA implements CarFactoryMethod {

    @Override
    public <T extends BaseCar> T createCar(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

}
