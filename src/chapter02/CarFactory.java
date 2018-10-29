package chapter02;

public class CarFactory {

    public static BaseCar getCar1(String carType) throws ClassNotFoundException {
        if(CarType.CAR_001.equals(carType)) {
            return new Car001();
        }
        if(CarType.CAR_002.equals(carType)) {
            return new Car002();
        }
        if(CarType.CAR_003.equals(carType)) {
            return new Car003();
        }
        
        throw new ClassNotFoundException("找不到这该类型的汽车，汽车的类型为：" + carType); 
    }
    
    public static BaseCar getCar2(String carType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        final String PACKAGE_PATH = "chapter02.";
        return (BaseCar)Class.forName(PACKAGE_PATH + carType).newInstance();
    }
    
    public static <T extends BaseCar>T getCar3(Class<T> className) throws InstantiationException, IllegalAccessException{
        return className.newInstance();
    }
}
