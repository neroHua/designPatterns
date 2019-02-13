package chapter12;

/**
 * 
 * 装饰模式
 * 不改变原来的类，使原来的类增加额外的能力
 * 
 * @author 滑德友
 * @time 2019年2月13日14:07:05 
 *
 */
public class Test {

    public static void main(String[] args) {
        GoodsDecorator goodsDecorator = new GoodsDecoratorRed(new GoodsA());
        goodsDecorator.showMyself();
    }

}
