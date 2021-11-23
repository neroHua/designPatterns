package chapter04.decorator.old;

/**
 * 
 * 装饰模式(decorator)
 * 不改变原来的类，使原来的类增加额外的能力
 * 
 * @author 滑德友
 * @time 2019年2月13日14:07:05 
 *
 */
public class Client {

    public static void main(String[] args) {
        GoodsDecorator goodsDecorator = new GoodsDecoratorRed(new GoodsA());
        goodsDecorator.showMyself();
    }

}
