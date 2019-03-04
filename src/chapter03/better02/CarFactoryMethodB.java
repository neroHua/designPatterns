package chapter03.better02;

public class CarFactoryMethodB implements CarFactoryMethod {

    @Override
    public <T extends BaseCar> T createCar(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

}
