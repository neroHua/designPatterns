package chapter04.proxy.old;

public class StaticGoodsA implements StaticGoods {
    
    private int price;
    
    public StaticGoodsA(int price) {
        this.price = price;
    }

    @Override
    public void showMyPrice() {
        System.out.println("我的价格是:" + this.price);
    }

}
