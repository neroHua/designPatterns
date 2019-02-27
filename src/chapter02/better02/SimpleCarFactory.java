package chapter02.better02;

public class SimpleCarFactory {

    public static BaseCar getCar(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter02.better02.";
        return (BaseCar)Class.forName(PACKAGE_PATH + carType).newInstance();
    }
    
}
