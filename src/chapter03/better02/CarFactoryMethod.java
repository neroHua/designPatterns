package chapter03.better02;

public abstract class CarFactoryMethod {

    public abstract <T extends BaseCar> T createCar(Class<T> className) throws InstantiationException, IllegalAccessException;
    
}
