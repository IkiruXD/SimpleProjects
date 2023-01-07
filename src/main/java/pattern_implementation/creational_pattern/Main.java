package pattern_implementation.creational_pattern;

import pattern_implementation.creational_pattern.audi.*;
import pattern_implementation.creational_pattern.bugatti.*;

public class Main {
    private static final String Owner = "Volkswagen";

    public static void main(String[] args) {
        //delegate
        OwnerController audi = new OwnerController(new Audi());
        OwnerController bentley = new OwnerController(new Bentley());
        OwnerController bugatti = new OwnerController(new Bugatti());
        audi.owner(Owner);
        bentley.owner(Owner);
        bugatti.owner(Owner);

        //factory
        CarsFactory carsFactory = new CarsFactory();
        CarShop carShop = new CarShop(carsFactory);
        carShop.orderCar(CarType.SportCar);

        //abstract
        IndustryFactory factory = new AudiFactory();
        Auto auto = factory.getAuto();
        auto.createCar();

        //builder
        Car myCar = new Car.Builder()
                .withName("A5")
                .withHeight(150)
                .withLength(350)
                .withWeight(2500)
                .withWidth(210)
                .withYear(2010)
                .build();
        System.out.println(myCar);

        //Cloneable
        Car car2 = new Car();
        try {
            car2 = myCar.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //check ??
        car2.setName("A6");
        System.out.println(car2);

        //singleton
        Singleton singleton = Singleton.getInstance("hello");
        Singleton anotherSingleton = Singleton.getInstance("hello again");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}

