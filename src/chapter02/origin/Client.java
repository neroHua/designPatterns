package chapter02.origin;

/**
 * 
 * 原始用法
 * 
 * @author 滑德友
 * @time 2019年2月27日18:14:08
 *
 */
public class Client {

    public static void main(String[] args) { 
        Car001 car001 = new Car001();
        Car002 car002 = new Car002();
        Car003 car003 = new Car003(); 
        
        car001.run();
        car002.run();
        car003.run();
    }

}
