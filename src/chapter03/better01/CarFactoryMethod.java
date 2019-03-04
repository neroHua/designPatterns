package chapter03.better01;

public interface CarFactoryMethod {

    public BaseCar createCar(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    
}