package chapter02.data;

public class Character implements Glyph {

    private char character;

    public Character(char character) {
        this.character = character;
    }

    @Override
    public void draw(Window window) {
        window.drawCharacter(this);
    }

    @Override
    public boolean intersects(Point point) {
        return true;
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
