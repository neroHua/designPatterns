package chapter04.decorator.old;

public abstract class GoodsDecorator {
    
    Goods goods;
    
    public GoodsDecorator(Goods goods) {
        this.goods = goods;
    }
    
    public void showMyself() {
        this.decorate();
        goods.showMyself();
    }
    
    public abstract void decorate(); 

}
