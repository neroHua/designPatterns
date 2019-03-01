package chapter03.better02;

public class CarFactoryMethodA extends CarFactoryMethod {

    @Override
    public <T extends BaseCar> T createCar(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

}
