package za.ac.cput.repository.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;
import za.ac.cput.factory.CarFactory;
import za.ac.cput.repository.CarRepository;

import static org.junit.jupiter.api.Assertions.*;
//Imtiyaaz Waggie 219374759 27/03/2025//

public class CarRepositoryImplTest {
    private CarRepository repository;
    private Car car;

    @BeforeEach
    void setUp() {
        repository = CarRepositoryImpl.getRepository();
        car = CarFactory.createCar(1, "Corolla", "Toyota", 2020, true, 500.0);
        repository.create(car);
    }

    @Test
    void create() {
        Car newCar = CarFactory.createCar(2, "Civic", "Honda", 2022, true, 600.0);
        Car createdCar = repository.create(newCar);
        assertNotNull(createdCar);
        assertEquals(2, createdCar.getCarID());
    }

    @Test
    void read() {
        Car readCar = repository.read(car.getCarID());
        assertNotNull(readCar);
        assertEquals(car.getCarID(), readCar.getCarID());
    }

    @Test
    void update() {
        Car updatedCar = new Car.Builder()
                .setCarID(car.getCarID())
                .setModel("Corolla Hybrid")
                .setBrand(car.getBrand())
                .setYear(car.getYear())
                .setAvailability(car.isAvailable())
                .setRentalPrice(550.0)
                .build();
        Car result = repository.update(updatedCar);
        assertNotNull(result);
        assertEquals("Corolla Hybrid", result.getModel());
        assertEquals(550.0, result.getRentalPrice());
    }

    @Test
    void delete() {
        repository.delete(car.getCarID());
        Car deletedCar = repository.read(car.getCarID());
        assertNull(deletedCar);
    }

}
