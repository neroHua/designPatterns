package chapter04.bridge.old.better02;

/**
 * 
 * 桥接模式
 * 
 * 下面举的例子是：当一个对象，有多个维度需要独立扩展，通过委托来关联。
 * 
 * @author 滑德友 
 * @time 2019年3月5日16:49:15
 *
 */
public class Client {

    public static void main(String[] args) {
        Color colorBlue = new ColorBlue();
        Color colorRed = new ColorRed();
        Shape shapeCircle = new ShapeCircle();
        Shape shapeRectangle = new ShapeRectangle();
        
        Graph graphBlueCircle = new GraphImpl(colorBlue, shapeCircle);
        Graph graphBlueRectangle = new GraphImpl(colorBlue, shapeRectangle);
        Graph graphRedCircle = new GraphImpl(colorRed, shapeCircle);
        Graph graphRedRectangle= new GraphImpl(colorRed, shapeRectangle);

        graphBlueCircle.show();
        graphBlueRectangle .show();
        graphRedCircle.show();
        graphRedRectangle.show();
    }

}
