package chapter03.abstractFactory.product.family.a;

import chapter03.abstractFactory.BicycleAbstractFactory;
import chapter03.abstractFactory.product.Pedal;
import chapter03.abstractFactory.product.Seat;

public class AFamilyFactory implements BicycleAbstractFactory {

    @Override
    public Seat createSeat() {
        return new ASeat();
    }

    @Override
    public Pedal createPedal() {
        return new APedal();
    }

}
