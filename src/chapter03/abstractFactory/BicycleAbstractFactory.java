package chapter03.abstractFactory;

import chapter03.abstractFactory.product.Pedal;
import chapter03.abstractFactory.product.Seat;

/**
 * 自行车的抽象工厂
 */
public interface BicycleAbstractFactory {

    Seat createSeat();

    Pedal createPedal();

}
