package chapter02.data;

public class Scroller extends MonoGlyph {

    @Override
    public void draw(Window window) {
        super.draw(window);
        drawScroller(window);
    }

    public void drawScroller(Window window) {
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
