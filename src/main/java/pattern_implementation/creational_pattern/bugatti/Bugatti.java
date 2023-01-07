package pattern_implementation.creational_pattern.bugatti;

import pattern_implementation.creational_pattern.*;

public class Bugatti implements Company, Auto, Motorcycle, Ship {
    @Override
    public void owner(String name) {
        System.out.println("Сompany Bugatti. Owner : " + name);
    }

    @Override
    public void createCar() {
        System.out.println("Bugatti cars");
    }

    @Override
    public void createMotorcycle() {
        System.out.println("Bugatti motorcycle");
    }

    @Override
    public void createShip() {
        System.out.println("Bugatti ships");
    }
}
