package chapter04.bridge.old.better01;

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
public class Client {

    public static void main(String[] args) {
        Color colorBlue = new ColorBlue();
        Color colorRed = new ColorRed();
        
        Graph graphRedCircle = new ShapeCircle(colorRed);
        Graph graphBlueCircle = new ShapeCircle(colorBlue);
        Graph graphRedRectangle= new ShapeRectangle(colorRed);
        Graph graphBlueRectangle= new ShapeRectangle(colorBlue);

        graphBlueCircle.show();
        graphBlueRectangle .show();
        graphRedCircle.show();
        graphRedRectangle.show();
    }

}
