package chapter03.better01;

public class CarFactoryMethodB extends CarFactoryMethod {

    @Override
    public BaseCarB createCar(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter03.better01.";
        return (BaseCarB)Class.forName(PACKAGE_PATH + carType).newInstance();
    }

}