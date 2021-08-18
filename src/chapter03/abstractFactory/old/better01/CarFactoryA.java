package chapter03.abstractFactory.old.better01;

public class CarFactoryA implements CarFactoryAbstract {

    @Override
    public BaseCarA createCar(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter04.better01.";
        return (BaseCarA)Class.forName(PACKAGE_PATH + carType).newInstance();
    }

    @Override
    public BaseWheelA createWheel(String wheelType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter04.better01.";
        return (BaseWheelA)Class.forName(PACKAGE_PATH + wheelType).newInstance();
    }

}