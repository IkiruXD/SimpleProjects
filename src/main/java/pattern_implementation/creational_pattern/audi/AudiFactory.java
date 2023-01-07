package pattern_implementation.creational_pattern.audi;

import pattern_implementation.creational_pattern.*;
import pattern_implementation.creational_pattern.IndustryFactory;

public class AudiFactory implements IndustryFactory {
    @Override
    public Auto getAuto() {
        return new AudiCar();
    }

    @Override
    public Motorcycle getMotorcycle() {
        return new AudiMotorcycle();
    }

    @Override
    public Ship getShip() {
        return new AudiShips();
    }
}
