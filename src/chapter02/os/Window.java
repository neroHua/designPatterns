package chapter02.os;

import chapter02.data.Character;
import chapter02.data.Polygon;
import chapter02.data.Rectangle;

public interface Window {

    public void drawCharacter(Character character);

    public void drawRectangle(Rectangle rectangle);

    public void drawPolygon(Polygon polygon);
}
