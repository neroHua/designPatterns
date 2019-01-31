package chapter04;

import chapter04.BaseCar;

public abstract class CarFactory {

    public abstract BaseCar createCar1(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    public abstract <T extends BaseCar>T createCar2(Class<T> className) throws InstantiationException, IllegalAccessException;
    
    public abstract BaseWheel createWheel1(String wheelType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    public abstract <T extends BaseWheel>T createWheel2(Class<T> className) throws InstantiationException, IllegalAccessException;
    
}
