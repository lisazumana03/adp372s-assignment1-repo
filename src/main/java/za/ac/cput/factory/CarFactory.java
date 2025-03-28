package za.ac.cput.factory;

import za.ac.cput.domain.Car;

/*
 * Imtiyaaz Waggie 219374759s
 * Date: 25/03/2025
 */

public class CarFactory {
    public static Car createCar(int carID, String model, String brand, int year, boolean availability, double rentalPrice) {
        if (carID < 0 || carID > 100000) {
            return null;
        }
        if (model == null || model.isEmpty()) {
            return null;
        }
        if (brand == null || brand.isEmpty()) {
            return null;
        }
        if (year < 1886 || year > 2100) {
            return null;
        }
        if (rentalPrice < 0) {
            return null;
        }

        return new Car.Builder()
                .setCarID(carID)
                .setModel(model)
                .setBrand(brand)
                .setYear(year)
                .setAvailability(availability)
                .setRentalPrice(rentalPrice)
                .build();
    }


}