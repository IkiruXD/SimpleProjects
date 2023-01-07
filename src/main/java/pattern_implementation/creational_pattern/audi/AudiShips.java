package pattern_implementation.creational_pattern.audi;

import pattern_implementation.creational_pattern.Ship;

public class AudiShips implements Ship {
    @Override
    public void createShip() {
        System.out.println("Audi ships");
    }
}
