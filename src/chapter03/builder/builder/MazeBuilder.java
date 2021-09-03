package chapter03.builder.builder;

import chapter03.builder.product.Maze;

public interface MazeBuilder {

    Maze build();

    MazeBuilder buildRoom(Integer roomNumber);

    MazeBuilder buildDoor(Integer roomNumber1, Integer roomNumber2);

}
