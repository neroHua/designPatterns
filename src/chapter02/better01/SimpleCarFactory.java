package chapter02.better01;

public class SimpleCarFactory {

    public static BaseCar getCar(String carType) {
        if("Car001".equals(carType)) {
            return new Car001();
        }
        if("Car002".equals(carType)) {
            return new Car002();
        }
        if("Car003".equals(carType)) {
            return new Car003();
        }
        
        throw new RuntimeException("找不到这该类型的汽车，汽车的类型为：" + carType); 
    }
    
}
