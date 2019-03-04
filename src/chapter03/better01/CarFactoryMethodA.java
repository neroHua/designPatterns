package chapter03.better01;

public class CarFactoryMethodA implements CarFactoryMethod {

    @Override
    public BaseCarA createCar(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter03.better01.";
        return (BaseCarA)Class.forName(PACKAGE_PATH + carType).newInstance();
    }

}