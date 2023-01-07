package pattern_implementation.creational_pattern.audi;

import pattern_implementation.creational_pattern.*;

public class Audi implements Company, Auto, Ship {
    @Override
    public void owner(String name) {
        System.out.println("Сompany Audi. Owner : " + name);
    }

    @Override
    public void createCar() {
        System.out.println("Audi cars");
    }

    @Override
    public void createShip() {
        System.out.println("Audi Ships");
    }
}
