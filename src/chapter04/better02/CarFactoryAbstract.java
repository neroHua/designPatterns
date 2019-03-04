package chapter04.better02;

public interface CarFactoryAbstract {

    public <T extends BaseCar>T createCar(Class<T> className) throws InstantiationException, IllegalAccessException;
    
    public <T extends BaseWheel>T createWheel(Class<T> className) throws InstantiationException, IllegalAccessException;
    
}
