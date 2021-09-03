package chapter03.builder.builder;

import chapter03.builder.product.part.Door;
import chapter03.builder.product.Maze;
import chapter03.builder.product.part.Room;

import java.util.ArrayList;

public class StandMazeBuilder implements MazeBuilder {

    private Maze maze;

    public StandMazeBuilder() {
        this.maze = new Maze(new ArrayList<Room>(), new ArrayList<Door>());
    }

    @Override
    public Maze build() {
        return this.maze;
    }

    @Override
    public MazeBuilder buildRoom(Integer roomNumber) {
        Room room = new Room(roomNumber);
        this.maze.getRoomList().add(room);

        return this;
    }

    @Override
    public MazeBuilder buildDoor(Integer roomNumber1, Integer roomNumber2) {
        Door door = new Door(roomNumber1, roomNumber2);
        this.maze.getDoorList().add(door);

        return this;
    }

}
