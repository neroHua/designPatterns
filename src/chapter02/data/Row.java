package chapter02.data;

import chapter02.format.Format;
import chapter02.os.Window;

import java.util.List;

public class Row implements Glyph {

    private Glyph parent;

    private List<Glyph> children;

    private Format format;

    public Row(Glyph parent, List<Glyph> children, Format format) {
        this.parent = parent;
        this.children = children;
        this.format = format;
    }

    @Override
    public void draw(Window window) {
        for (Glyph glyph : children) {
            glyph.draw(window);
        }
    }

    @Override
    public boolean intersects(Point point) {
        for (Glyph glyph : children) {
            if (glyph.intersects(point)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void insert(Glyph glyph, int index) {
        children.set(index, glyph);
        format.format();
    }

    @Override
    public void remove(Glyph glyph) {
        children.remove(glyph);
    }

    @Override
    public Glyph child(int index) {
        return null;
    }

    @Override
    public Glyph parent() {
        return null;
    }

    public Glyph getParent() {
        return parent;
    }

    public void setParent(Glyph parent) {
        this.parent = parent;
    }

    public List<Glyph> getChildren() {
        return children;
    }

    public void setChildren(List<Glyph> children) {
        this.children = children;
    }

}
