package chapter04.bridge.old.better01;

public class ShapeRectangle extends AbstractShape {

    public ShapeRectangle(Color color) {
        super(color);
    }

    @Override
    public void show() {
        super.color.show();
        System.out.println("我的形状是：矩形");
    }

}
