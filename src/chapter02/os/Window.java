package chapter02.os;

import chapter02.data.Character;
import chapter02.data.Glyph;
import chapter02.data.Polygon;
import chapter02.data.Rectangle;

public abstract class Window {

    private Glyph glyph;

    public abstract void drawCharacter(Character character);

    public abstract void drawRectangle(Rectangle rectangle);

    public abstract void drawPolygon(Polygon polygon);

    public void redrawn() {
        glyph.draw(this);
    }

}
