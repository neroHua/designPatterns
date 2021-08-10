package chapter02.os;

import chapter02.data.Character;
import chapter02.data.Point;
import chapter02.data.Polygon;
import chapter02.data.Rectangle;
import chapter02.os.impl.XWindowImpl;

public abstract class WindowImpl extends Window {

    private WindowImpl concreteWindowImpl;

    public WindowImpl() {
        // init by os
        concreteWindowImpl = new XWindowImpl();
    }

    @Override
    public void drawCharacter(Character character) {
        concreteWindowImpl.drawCharacter(character);
    }

    @Override
    public void drawRectangle(Rectangle rectangle) {
        concreteWindowImpl.drawRectangle(rectangle.getPoint1(), rectangle.getPoint2());
    }

    @Override
    public void drawPolygon(Polygon polygon) {
        concreteWindowImpl.drawPolygon(polygon);
    }

    public abstract void drawRectangle(Point point1, Point point2);

}
