package car;

import car.cars.AudiCar;
import car.cars.TeslaCar;

public class SimpleCarFactory {

    public static Car createCar(String brand) {
        Car car = null;
        if(brand.equalsIgnoreCase("tesla")) {
            car = new TeslaCar();
        } else if(brand.equalsIgnoreCase("audi")) {
            car = new AudiCar();
        }
        return car;
    }

}
