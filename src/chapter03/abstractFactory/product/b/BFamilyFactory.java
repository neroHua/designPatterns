package chapter03.abstractFactory.product.family.b;

import chapter03.abstractFactory.BicycleAbstractFactory;
import chapter03.abstractFactory.product.Pedal;
import chapter03.abstractFactory.product.Seat;

public class BFamilyFactory implements BicycleAbstractFactory {

    @Override
    public Seat createSeat() {
        return new BSeat();
    }

    @Override
    public Pedal createPedal() {
        return new BPedal();
    }

}
