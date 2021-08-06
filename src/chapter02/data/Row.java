package chapter02.data;

import java.util.List;

public class Row implements Glyph {

    private List<Glyph> children;

    public Row(List<Glyph> children) {
        this.children = children;
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

    }

    public List<Glyph> getChildren() {
        return children;
    }

    public void setChildren(List<Glyph> children) {
        this.children = children;
    }
}
