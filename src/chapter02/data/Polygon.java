package chapter02.data;

public class Polygon implements Glyph {

    @Override
    public void draw(Window window) {
        window.drawPolygon(this);
    }

    @Override
    public boolean intersects(Point point) {
        return true;
    }

    @Override
    public void insert(Glyph glyph, int type) {

    }

}
