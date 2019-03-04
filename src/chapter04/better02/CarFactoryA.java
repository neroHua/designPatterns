package chapter04.better02;

public class CarFactoryA implements CarFactoryAbstract {

    @Override
    public <T extends BaseCar> T createCar(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

    @Override
    public <T extends BaseWheel> T createWheel(Class<T> className) throws InstantiationException, IllegalAccessException {
        return className.newInstance();
    }

}
