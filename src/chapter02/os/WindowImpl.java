package chapter02.os;

import chapter02.data.Character;
import chapter02.data.Polygon;
import chapter02.data.Rectangle;

public abstract class WindowImpl extends Window {

    private Window concreteWindow;

    public WindowImpl() {
        
    }

    @Override
    public void drawCharacter(Character character) {
        concreteWindow.drawCharacter(character);
    }

    @Override
    public void drawRectangle(Rectangle rectangle) {
        concreteWindow.drawRectangle(rectangle);
    }

    @Override
    public void drawPolygon(Polygon polygon) {
        concreteWindow.drawPolygon(polygon);
    }

}
