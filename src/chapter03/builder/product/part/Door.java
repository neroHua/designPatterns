package chapter03.builder.product.part;

public class Door {

    Room room1;

    Room room2;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Door(Integer roomNumber1, Integer roomNumber2) {
        this.room1 = new Room(roomNumber1);
        this.room2 = new Room(roomNumber2);
    }

    public Room getRoom1() {
        return room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public void setRoom2(Room room2) {
        this.room2 = room2;
    }

}
