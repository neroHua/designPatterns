package chapter03.simpleFactory.better02;

/**
 * 
 * 简单工厂模式 + 反射 + 多态
 * 
 * @author 滑德友
 * @time 2019年2月27日18:19:48
 *
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ReflectiveOperationException {
        Car001 car001 = (Car001)SimpleCarFactory.getCar("Car001");
        Car002 car002 = (Car002)SimpleCarFactory.getCar("Car002");
        Car003 car003 = (Car003)SimpleCarFactory.getCar("Car003");
        
        car001.run();
        car002.run();
        car003.run();
    }

}
