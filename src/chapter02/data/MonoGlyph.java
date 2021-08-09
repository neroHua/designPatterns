package chapter02.data;

public abstract class MonoGlyph implements Glyph {

    private Glyph glyph;

    @Override
    public void draw(Window window) {
        glyph.draw(window);
    }

}
