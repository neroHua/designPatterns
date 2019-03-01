package chapter03.origin;

/**
 * 
 * 原始用法
 * 
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
