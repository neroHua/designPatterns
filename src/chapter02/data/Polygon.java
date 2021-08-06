package chapter02.data;

import chapter02.format.Format;

public class Polygon implements Glyph {

    private Format format;

    public Polygon(Format format) {
        this.format = format;
    }

    @Override
    public void draw(Window window) {
        window.drawPolygon(this);
    }

    @Override
    public boolean intersects(Point point) {
        return true;
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
