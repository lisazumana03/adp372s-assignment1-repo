package za.ac.cput.domain;

public class Car {  //IMTIYAAZ WAGGIE 219374759//
    protected int carID;
    protected String model;
    protected String brand;
    protected int year;
    protected boolean availability;
    protected double rentalPrice;

    private Car(Builder builder) {
        this.carID = builder.carID;
        this.model = builder.model;
        this.brand = builder.brand;
        this.year = builder.year;
        this.availability = builder.availability;
        this.rentalPrice = builder.rentalPrice;
    }

    public int getCarID() {
        return carID;
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public boolean isAvailable() {
        return availability;
    }
    public double getRentalPrice() {
        return rentalPrice;
    }

    public static class Builder {
        private int carID;
        private String model;
        private String brand;
        private int year;
        private boolean availability;
        private double rentalPrice;

        public Builder setCarID(int carID) {
            this.carID = carID;
            return this;
        }
        public Builder setModel(String model) {
            this.model = model;
            return this;
        }
        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder setYear(int year) {
            this.year = year;
            return this;
        }
        public Builder setAvailability(boolean availability) {
            this.availability = availability;
            return this;
        }
        public Builder setRentalPrice(double rentalPrice) {
            this.rentalPrice = rentalPrice;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}