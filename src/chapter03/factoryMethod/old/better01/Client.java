package chapter03.factoryMethod.old.better01;

/**
 * 
 * 工厂方法模式 + 反射 + 多态
 * 
 * 当新增加C公司汽车，则增加BaseCCar，CarC001，CarC002，CarC003，和 CarCFactory，不用修改原来的类
 * 
 * @author 滑德友
 * @time 2019年1月31日17:24:19
 *
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        CarFactoryMethodA carFactoryMethodA = new CarFactoryMethodA();
        CarFactoryMethodB carFactoryMethodB = new CarFactoryMethodB();
        
        CarA001 carA001 = (CarA001)carFactoryMethodA .createCar("CarA001");
        CarA002 carA002 = (CarA002)carFactoryMethodA .createCar("CarA002");
        CarA003 carA003 = (CarA003)carFactoryMethodA .createCar("CarA003");
        CarB001 carB001 = (CarB001)carFactoryMethodB .createCar("CarB001");
        CarB002 carB002 = (CarB002)carFactoryMethodB .createCar("CarB002");
        CarB003 carB003 = (CarB003)carFactoryMethodB .createCar("CarB003");
        
        carA001.showMyCompany();
        carA001.showMyType();
        carA001.run();
        carA002.showMyCompany();
        carA002.showMyType();
        carA002.run();
        carA003.showMyCompany();
        carA003.showMyType();
        carA003.run();
        carB001.showMyCompany();
        carB001.showMyType();
        carB001.run();
        carB002.showMyCompany();
        carB002.showMyType();
        carB002.run();
        carB003.showMyCompany();
        carB003.showMyType();
        carB003.run();
    }

}
