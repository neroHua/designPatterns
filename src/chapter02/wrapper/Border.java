package chapter02.wrapper;

import chapter02.data.Glyph;
import chapter02.data.Point;
import chapter02.os.Window;

public class Border extends MonoGlyph {

    @Override
    public void draw(Window window) {
        super.draw(window);
        drawBorder(window);
    }

    public void drawBorder(Window window) {
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
