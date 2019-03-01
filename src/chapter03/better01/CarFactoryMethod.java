package chapter03.better01;

public abstract class CarFactoryMethod {

    public abstract BaseCar createCar(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    
}