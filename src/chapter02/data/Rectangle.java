package chapter02.data;

public class Rectangle implements Glyph {

    @Override
    public void draw(Window window) {
        window.drawRectangle(this);
    }

    @Override
    public boolean intersects(Point point) {
        return false;
    }

    @Override
    public void insert(Glyph glyph, int index) {

    }

    @Override
    public void remove(Glyph glyph) {

    }

    @Override
    public Glyph child(int index) {
        return null;
    }

    @Override
    public Glyph parent() {
        return null;
    }

}
