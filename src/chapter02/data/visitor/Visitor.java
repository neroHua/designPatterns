package chapter02.data.visitor;

import chapter02.data.*;
import chapter02.data.Character;

public interface Visitor {

    void visitCharacter(Character character);

    void visitPolygon(Polygon polygon);

    void visitRectangle(Rectangle rectangle);

    void visitRow(Row row);

}
