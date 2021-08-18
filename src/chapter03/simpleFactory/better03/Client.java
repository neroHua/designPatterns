package chapter03.simpleFactory.better03;

/**
 * 
 * 简单工厂模式 + 反射 + 泛型
 * 
 * @author 滑德友
 * @time 2019年2月27日18:20:21
 *
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Car001 car001 = SimpleCarFactory.getCar(Car001.class);
        Car002 car002 = SimpleCarFactory.getCar(Car002.class);
        Car003 car003 = SimpleCarFactory.getCar(Car003.class);
        
        car001.run();
        car002.run();
        car003.run();
    }

}
