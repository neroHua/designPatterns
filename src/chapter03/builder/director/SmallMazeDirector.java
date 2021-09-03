package chapter03.builder.director;

import chapter03.builder.builder.MazeBuilder;

public class SmallMazeDirector extends MazeDirector {

    public SmallMazeDirector(MazeBuilder mazeBuilder) {
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
                .buildDoor(1, 7);
    }

}
