package chapter03.better02;

/**
 * 
 * 工厂方法模式 + 反射 + 泛型
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
        
        CarA001 carA001 = carFactoryMethodA .createCar(CarA001.class);
        CarA002 carA002 = carFactoryMethodA .createCar(CarA002.class);
        CarA003 carA003 = carFactoryMethodA .createCar(CarA003.class);
        CarB001 carB001 = carFactoryMethodB .createCar(CarB001.class);
        CarB002 carB002 = carFactoryMethodB .createCar(CarB002.class);
        CarB003 carB003 = carFactoryMethodB .createCar(CarB003.class);
        
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
