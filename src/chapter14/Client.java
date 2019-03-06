package chapter14;

/**
 * 
 * 享元模式(flyweight)
 * 对于不变的东西，可以共用
 * 
 * @author 滑德友
 * @time 2019年2月14日19:07:30 
 *
 */
public class Client {

    public static void main(String[] args) {
        
        Goods goods1 = GoodsFactory.getGoods("red");
        goods1.showMyself();
        GoodsFactory.showMysize();
        
        Goods goods2 = GoodsFactory.getGoods("red");
        goods2.showMyself();
        GoodsFactory.showMysize();

        Goods goods3 = GoodsFactory.getGoods("blue");
        goods3.showMyself();
        GoodsFactory.showMysize();
    }

}
