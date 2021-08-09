package chapter02.wrapper;

import chapter02.data.Glyph;
import chapter02.os.Window;

public abstract class MonoGlyph implements Glyph {

    private Glyph glyph;

    @Override
    public void draw(Window window) {
        glyph.draw(window);
    }

}
