package car.cars;

import car.Car;

public abstract class BasicCar implements Car {

    String brand;

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "BasicCar{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
