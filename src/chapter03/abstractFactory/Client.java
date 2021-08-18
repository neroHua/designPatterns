package chapter03.abstractFactory;

import chapter03.abstractFactory.product.Pedal;
import chapter03.abstractFactory.product.Seat;
import chapter03.abstractFactory.product.family.a.AFamilyFactory;

public class Client {

    // somewhere to init this or exchange this
    private static BicycleAbstractFactory bicycleAbstractFactory = new AFamilyFactory();

    public static void main(String[] args) {
        Pedal pedal = bicycleAbstractFactory.createPedal();
        Seat seat = bicycleAbstractFactory.createSeat();
    }

}
