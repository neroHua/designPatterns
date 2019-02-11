package chapter09;

/**
 * 
 * 桥接模式
 * 
 * 下面举的例子是：当一个对象，有两个维度需要独立扩展，但是两个维度又有一些联系时，通过委托来关联。
 * 
 * @author 滑德友 
 * @time 2019年2月11日10:01:59
 *
 */
public class Test {

    public static void main(String[] args) {
        PartA partA = new PartAImp1(new PartBImp1("B1"), "A1");

        partA.from().bridgeToPartB();
    }

}
