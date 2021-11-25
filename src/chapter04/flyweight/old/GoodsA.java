package chapter04.flyweight.old;

public class GoodsA extends Goods {
    
    public GoodsA(String color) {
        this.color = color;
    }

    @Override
    public void showMyself() {
        System.out.println("我的颜色是:" + this.color);
    }

}
