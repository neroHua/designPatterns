package chapter03;

import chapter03.BaseCar;

public abstract class CarFactory {

    public abstract BaseCar createCar1(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    public abstract <T extends BaseCar>T createCar2(Class<T> className) throws InstantiationException, IllegalAccessException;
    
}
