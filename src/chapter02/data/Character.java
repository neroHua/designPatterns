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
        return point.intersects(this);

    }

    @Override
    public void insert(Glyph glyph, int type) {

    }

}
