package pattern_implementation.creational_pattern.audi;

import pattern_implementation.creational_pattern.Motorcycle;

public class AudiMotorcycle implements Motorcycle {
    @Override
    public void createMotorcycle() {
        System.out.println("Audi motorcycle");
    }
}
