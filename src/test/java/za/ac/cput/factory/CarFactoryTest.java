package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    void createCar() {
        Car car = new Car.Builder()
                .setCarID(101)
                .setModel("Corolla")
                .setBrand("Toyota")
                .setYear(2022)
                .setAvailability(true)
                .setRentalPrice(500.00)
                .build();

        assertEquals(101, car.getCarID());
        assertEquals("Corolla", car.getModel());
        assertEquals("Toyota", car.getBrand());
        assertEquals(2022, car.getYear());
        assertTrue(car.isAvailable());
        assertEquals(500.00, car.getRentalPrice());
        assertNotNull(car);
    }

    @Test
    void updateAvailability() {
        Car car = new Car.Builder()
                .setCarID(102)
                .setModel("Civic")
                .setBrand("Honda")
                .setYear(2021)
                .setAvailability(true)
                .setRentalPrice(600.00)
                .build();

        Car updatedCar = new Car.Builder()
                .setCarID(car.getCarID())
                .setModel(car.getModel())
                .setBrand(car.getBrand())
                .setYear(car.getYear())
                .setAvailability(false) // Changing availability
                .setRentalPrice(car.getRentalPrice())
                .build();

        assertFalse(updatedCar.isAvailable());
    }
}
