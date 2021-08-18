package chapter03.abstractFactory.old.origin;

/**
 * 
 * 原始用法
 * 
 * @author 滑德友
 * @time 2019年1月31日17:24:19
 *
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        CarA001 carA001 = new CarA001(); 
        CarA002 carA002 = new CarA002(); 
        CarA003 carA003 = new CarA003();
        CarB001 carB001 = new CarB001();
        CarB002 carB002 = new CarB002(); 
        CarB003 carB003 = new CarB003();
        WheelA001 wheelA001 = new WheelA001();
        WheelA002 wheelA002 = new WheelA002();
        WheelA003 wheelA003 = new WheelA003();
        WheelB001 wheelB001 = new WheelB001();
        WheelB002 wheelB002 = new WheelB002();
        WheelB003 wheelB003 = new WheelB003();

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