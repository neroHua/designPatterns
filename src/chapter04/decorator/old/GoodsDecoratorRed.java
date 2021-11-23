package chapter04.decorator.old;

public class GoodsDecoratorRed extends GoodsDecorator {

    public GoodsDecoratorRed(Goods goods) {
        super(goods);
    }

    @Override
    public void decorate() {
        System.out.println("为物品上色：红色");
    }

}
