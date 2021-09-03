package chapter03.builder.director;

import chapter03.builder.builder.MazeBuilder;

public class ComplexMazeDirector extends MazeDirector {

    public ComplexMazeDirector(MazeBuilder mazeBuilder) {
        super(mazeBuilder);
    }

    @Override
    public void construct() {
        super.mazeBuilder
                .buildRoom(1)
                .buildRoom(2)
                .buildRoom(3)
                .buildRoom(4)
                .buildRoom(5)
                .buildRoom(6)
                .buildRoom(7)
                .buildDoor(1, 2)
                .buildDoor(1, 3)
                .buildDoor(1, 4)
                .buildDoor(1, 5)
                .buildDoor(1, 6)
                .buildDoor(1, 7)
                .buildDoor(2, 1)
                .buildDoor(2, 3)
                .buildDoor(2, 4)
                .buildDoor(2, 5)
                .buildDoor(2, 6)
                .buildDoor(2, 7)
                .buildDoor(3, 1)
                .buildDoor(3, 2)
                .buildDoor(3, 4)
                .buildDoor(3, 5)
                .buildDoor(3, 6)
                .buildDoor(3, 7);
    }

}
