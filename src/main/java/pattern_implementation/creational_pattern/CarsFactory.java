package pattern_implementation.creational_pattern;

public class CarsFactory {
    public Car createCar(CarType type) {
        Car car = null;

        switch(type) {
            case Coupe:
                car = new Coupe();
                break;
            case Sedan:
                car = new Sedan();
                break;
            case SportCar:
                car = new SportCar();
                break;
        }
        return car;
    }
}

