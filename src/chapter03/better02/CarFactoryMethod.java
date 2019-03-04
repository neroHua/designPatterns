package chapter03.better02;

public interface CarFactoryMethod {

    public <T extends BaseCar> T createCar(Class<T> className) throws InstantiationException, IllegalAccessException;
    
}
