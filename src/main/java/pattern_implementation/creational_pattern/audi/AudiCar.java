package pattern_implementation.creational_pattern.audi;

import pattern_implementation.creational_pattern.Auto;

public class AudiCar implements Auto {
    @Override
    public void createCar() {
        System.out.println("Audi cars");
    }
}
