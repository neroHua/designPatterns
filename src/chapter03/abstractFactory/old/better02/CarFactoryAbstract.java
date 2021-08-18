package chapter03.abstractFactory.old.better02;

public interface CarFactoryAbstract {

    public <T extends BaseCar>T createCar(Class<T> className) throws InstantiationException, IllegalAccessException;
    
    public <T extends BaseWheel>T createWheel(Class<T> className) throws InstantiationException, IllegalAccessException;
    
}
