package chapter02.data;

import chapter02.format.Format;
import chapter02.os.Window;

public class Rectangle implements Glyph {

    private Format format;

    public Rectangle(Format format) {
        this.format = format;
    }

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
        format.format();
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
