package chapter03.abstractFactory.old.better01;

/**
 * 
 * 抽象工厂模式
 * 
 * 具体工厂不仅能生产汽车,还能生产相应的车轮
 * 
 * @author 滑德友
 * @time 2019年1月31日17:24:19
 *
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        CarFactoryA carFactoryA = new CarFactoryA();
        CarFactoryB carFactoryB = new CarFactoryB();
        
        CarA001 carA001 = (CarA001) carFactoryA.createCar("CarA001");
        CarA002 carA002 = (CarA002) carFactoryA.createCar("CarA002");
        CarA003 carA003 = (CarA003) carFactoryA.createCar("CarA003");
        CarB001 carB001 = (CarB001) carFactoryB.createCar("CarB001");
        CarB002 carB002 = (CarB002) carFactoryB.createCar("CarB002");
        CarB003 carB003 = (CarB003) carFactoryB.createCar("CarB003");
        WheelA001 wheelA001 = (WheelA001) carFactoryA.createWheel("WheelA001");
        WheelA002 wheelA002 = (WheelA002) carFactoryA.createWheel("WheelA002");
        WheelA003 wheelA003 = (WheelA003) carFactoryA.createWheel("WheelA003");
        WheelB001 wheelB001 = (WheelB001) carFactoryB.createWheel("WheelB001");
        WheelB002 wheelB002 = (WheelB002) carFactoryB.createWheel("WheelB002");
        WheelB003 wheelB003 = (WheelB003) carFactoryB.createWheel("WheelB003");

        carA001.showMyCompany();
        carA001.showMyType();
        carA001.run();
        carA002.showMyCompany();
        carA002.showMyType();
        carA002.run();
        carA003.showMyCompany();
        carA003.showMyType();
        carA003.run();
        wheelA001.showMyCompany();
        wheelA001.showMyType();
        wheelA001.spin();
        wheelA002.showMyCompany();
        wheelA002.showMyType();
        wheelA002.spin();
        wheelA003.showMyCompany();
        wheelA003.showMyType();
        wheelA003.spin();
        carB001.showMyCompany();
        carB001.showMyType();
        carB001.run();
        carB002.showMyCompany();
        carB002.showMyType();
        carB002.run();
        carB003.showMyCompany();
        carB003.showMyType();
        carB003.run();
        wheelB001.showMyCompany();
        wheelB001.showMyType();
        wheelB001.spin();
        wheelB002.showMyCompany();
        wheelB002.showMyType();
        wheelB002.spin();
        wheelB003.showMyCompany();
        wheelB003.showMyType();
        wheelB003.spin();
    }

}