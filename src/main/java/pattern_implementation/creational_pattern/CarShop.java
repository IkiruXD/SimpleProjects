package pattern_implementation.creational_pattern;

public class CarShop {

    private final CarsFactory carsFactory;

    public CarShop(CarsFactory carsFactory){
        this.carsFactory = carsFactory;
    }

    public Car orderCar(CarType type){
        Car car = carsFactory.createCar(type);
        car.create();
        System.out.println("Done. "+ type);
        return car;
    }

}

