package chapter02;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Car001 car001 = (Car001)CarFactory.getCar1(CarType.CAR_001);
        Car002 car002 = (Car002)CarFactory.getCar2(CarType.CAR_002);
        Car003 car003 = CarFactory.getCar3(Car003.class);
        
        car001.run();
        car002.run();
        car003.run();
    }

}
