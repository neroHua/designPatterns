package chapter04;

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
public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ACarFactory aCarFactory = new ACarFactory();
        BCarFactory bCarFactory = new BCarFactory();
        
        ACar001 aCar0011 = (ACar001)aCarFactory.createCar1(ACarType.CAR_001);
        ACar001 aCar0012 = aCarFactory.createCar2(ACar001.class);
        AWheel001 aWheel0011 = (AWheel001)aCarFactory.createWheel1(AWheelType.WHEEL_001);
        AWheel001 aWheel0012 = aCarFactory.createWheel2(AWheel001.class);
        
        BCar001 bCar0011 = (BCar001)bCarFactory.createCar1(BCarType.CAR_001);
        BCar001 bCar0012 = bCarFactory.createCar2(BCar001.class);
        BWheel001 bWheel0011 = (BWheel001)bCarFactory.createWheel1(BWheelType.WHEEL_001);
        BWheel001 bWheel0012 = bCarFactory.createWheel2(BWheel001.class);
        
        aCar0011.showMyCompany();
        aCar0011.showMyType();
        aCar0011.run();
        aWheel0011.showMyCompany();
        aWheel0011.showMyType();
        aWheel0011.spin();
        
        aCar0012.showMyCompany();
        aCar0012.showMyType();
        aCar0012.run();
        aWheel0012.showMyCompany();
        aWheel0012.showMyType();
        aWheel0012.spin();
        
        bCar0011.showMyCompany();
        bCar0011.showMyType();
        bCar0011.run();
        bWheel0011.showMyCompany();
        bWheel0011.showMyType();
        bWheel0011.spin();
        
        bCar0012.showMyCompany();
        bCar0012.showMyType();
        bCar0012.run();
        bWheel0012.showMyCompany();
        bWheel0012.showMyType();
        bWheel0012.spin();
        
    }

}
