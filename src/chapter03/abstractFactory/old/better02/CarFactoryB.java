package chapter03.abstractFactory.old.better02;

public class CarFactoryB implements CarFactoryAbstract {

    @Override
    public <T extends BaseCar> T createCar(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

    @Override
    public <T extends BaseWheel> T createWheel(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

}