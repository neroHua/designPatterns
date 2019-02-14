package chapter14;

import java.util.HashMap;
import java.util.Map;

public class GoodsFactory {
    
   private static Map<String, Goods> goodsPool = new HashMap<String, Goods>(); 

   public static Goods getGoods(String color) {
       Goods goods = goodsPool.get(color); 
       
       if (goods == null) {
           goods = new GoodsA(color);
           goodsPool.put(color, goods);
       }
       
       return goods;
   }
   
   public static void showMysize() {
       System.out.println("我的体积是：" + goodsPool.size());
   }
    

}
