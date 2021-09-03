package chapter03.builder.product;

import chapter03.builder.product.part.Door;
import chapter03.builder.product.part.Room;

import java.util.List;

public class Maze {

    List<Room> roomList;

    List<Door> doorList;

    public Maze() {
    }

    public Maze(List<Room> roomList, List<Door> doorList) {
        this.roomList = roomList;
        this.doorList = doorList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Door> getDoorList() {
        return doorList;
    }

    public void setDoorList(List<Door> doorList) {
        this.doorList = doorList;
    }

}
