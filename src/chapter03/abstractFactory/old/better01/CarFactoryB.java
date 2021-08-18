package chapter03.abstractFactory.old.better01;

public class CarFactoryB implements CarFactoryAbstract {

    @Override
    public BaseCarB createCar(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter04.better01.";
        return (BaseCarB)Class.forName(PACKAGE_PATH + carType).newInstance();
    }

    @Override
    public BaseWheelB createWheel(String wheelType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter04.better01.";
        return (BaseWheelB)Class.forName(PACKAGE_PATH + wheelType).newInstance();
    }

}