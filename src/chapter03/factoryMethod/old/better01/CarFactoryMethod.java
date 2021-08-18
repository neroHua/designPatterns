package chapter03.factoryMethod.old.better01;

public interface CarFactoryMethod {

    public BaseCar createCar(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    
}