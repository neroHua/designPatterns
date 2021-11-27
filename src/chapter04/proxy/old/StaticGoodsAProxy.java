package chapter04.proxy.old;

public class StaticGoodsAProxy implements StaticGoods {
    
    private StaticGoods goods;
    
    public StaticGoodsAProxy(StaticGoods goods) {
        this.goods = goods;
    }

    @Override
    public void showMyPrice() {
        System.out.println("我正在为goods进行前置处理");
        this.goods.showMyPrice();
        System.out.println("我正在为goods进行后置处理");
    }

}
