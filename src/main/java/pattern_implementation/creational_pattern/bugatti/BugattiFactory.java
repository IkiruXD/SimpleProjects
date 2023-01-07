package pattern_implementation.creational_pattern.bugatti;

import pattern_implementation.creational_pattern.*;
import pattern_implementation.creational_pattern.IndustryFactory;

public class BugattiFactory implements IndustryFactory {
    @Override
    public Auto getAuto() {
        return new BugattiCar();
    }

    @Override
    public Motorcycle getMotorcycle() {
        return new BugattiMotorcycle();
    }

    @Override
    public Ship getShip() {
        return new BugattiShips();
    }
}
