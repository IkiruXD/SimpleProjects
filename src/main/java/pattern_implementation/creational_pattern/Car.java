package pattern_implementation.creational_pattern;

public class Car implements Cloneable{
    private String name;
    private int weight;
    private int length;
    private int width;
    private int height;
    private int year;

    public void create(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", year=" + year +
                '}';
    }

    public static class Builder {
        private Car newCar;

        public Builder() {
            newCar = new Car();
        }

        public Builder withName(String name) {
            newCar.name = name;
            return this;
        }

        public Builder withWeight(int weight) {
            newCar.weight = weight;
            return this;
        }

        public Builder withLength(int length) {
            newCar.length = length;
            return this;
        }

        public Builder withWidth(int width) {
            newCar.width = width;
            return this;
        }

        public Builder withHeight(int height) {
            newCar.height = height;
            return this;
        }

        public Builder withYear(int year) {
            newCar.year = year;
            return this;
        }

        public Car build() {
            return newCar;
        }
    }
}