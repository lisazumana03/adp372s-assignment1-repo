package za.ac.cput.factory;

import za.ac.cput.domain.Car;
// Imtiyaaz Waggie 219374759 24/03/2025//

public class CarFactory {
    public static Car createCar(int carID, String model, String brand, int year, boolean availability, double rentalPrice) {
        return new Car.Builder()
                .setCarID(carID)
                .setModel(model)
                .setBrand(brand)
                .setYear(year)
                .setAvailability(availability)
                .setRentalPrice(rentalPrice)
                .build();
    }

    public static Car updateAvailability(Car car, boolean availability) {
        return new Car.Builder()
                .setCarID(car.getCarID())
                .setModel(car.getModel())
                .setBrand(car.getBrand())
                .setYear(car.getYear())
                .setAvailability(availability)
                .setRentalPrice(car.getRentalPrice())
                .build();
    }

    public static double calculateRentalPrice(Car car, int rentalDays) {
        return car.getRentalPrice() * rentalDays;
    }
}

