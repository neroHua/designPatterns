package chapter03;

/**
 * 
 * 工厂模式
 * 
 * 当新增加C公司汽车，则增加CBaseCar，CCar001，CCar002，CCar003，和 CCarFactory，不用修改原来的类
 * 
 * @author 滑德友
 * @time 2019年1月31日17:24:19
 *
 */
public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ACarFactory aCarFactory = new ACarFactory();
        BCarFactory bCarFactory = new BCarFactory();
        
        ACar001 aCar0011 = (ACar001)(ABaseCar)aCarFactory.createCar1(ACarType.CAR_001);
        ACar001 aCar0012 = aCarFactory.createCar2(ACar001.class);
        BCar001 bCar0011 = (BCar001)(BBaseCar)bCarFactory.createCar1(BCarType.CAR_001);
        BCar001 bCar0012 = bCarFactory.createCar2(BCar001.class);
        
        aCar0011.showMyCompany();
        aCar0011.showMyType();
        aCar0011.run();
        
        aCar0012.showMyCompany();
        aCar0012.showMyType();
        aCar0012.run();
        
        bCar0011.showMyCompany();
        bCar0011.showMyType();
        bCar0011.run();
        
        bCar0012.showMyCompany();
        bCar0012.showMyType();
        bCar0012.run();

    }

}
