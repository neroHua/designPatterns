package chapter03.simpleFactory.better01;

/**
 * 
 * 简单工厂模式 + 多态
 * 
 * 倘若car分类，则需要修改工厂，违反开闭原则
 * 
 * @author 滑德友
 * @time 2019年2月27日18:19:36
 *
 */
public class Client {

    public static void main(String[] args) {
        Car001 car001 = (Car001)SimpleCarFactory.getCar("Car001");
        Car002 car002 = (Car002)SimpleCarFactory.getCar("Car002");
        Car003 car003 = (Car003)SimpleCarFactory.getCar("Car003");
        
        car001.run();
        car002.run();
        car003.run();
    }

}
