package za.ac.cput.repository;

import za.ac.cput.domain.Car;
import za.ac.cput.factory.CarFactory;
//Imtiyaaz waggie 219374759 25/03/25//

import java.util.HashMap;

public class CarRepositoryImpl implements CarRepository {
    private static CarRepositoryImpl repository = null;
    private HashMap<Integer, Car> carDB;

    private CarRepositoryImpl() {
        this.carDB = new HashMap<>();
    }

    public static CarRepository getRepository() {
        if (repository == null) {
            repository = new CarRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Car create(Car car) {
        if (car == null || carDB.containsKey(car.getCarID())) {
            return null;
        }
        carDB.put(car.getCarID(), car);
        return car;
    }

    @Override
    public Car read(Integer id) {
        return carDB.get(id);
    }

    @Override
    public Car update(Car car) {
        if (carDB.containsKey(car.getCarID())) {
            carDB.put(car.getCarID(), car);
            return car;
        }
        return null;
    }

    @Override
    public void delete(Car car) {
        carDB.remove(car.getCarID());
    }

    public Car updateAvailability(int carID, boolean availability) {
        Car car = carDB.get(carID);
        if (car != null) {
            Car updatedCar = CarFactory.updateAvailability(car, availability);
            carDB.put(carID, updatedCar);
            return updatedCar;
        }
        return null;
    }
}
