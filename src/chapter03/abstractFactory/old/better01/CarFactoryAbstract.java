package chapter03.abstractFactory.old.better01;

public interface CarFactoryAbstract {

    public BaseCar createCar(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    
    public BaseWheel createWheel(String wheelType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    
}
