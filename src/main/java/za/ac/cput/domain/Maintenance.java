/*
 * Sibulele Gift Nohamba (220374686)
 * Date: 25/03/2025
 * */
package za.ac.cput.domain;

import java.util.Date;

public class Maintenance {
    protected int maintenanceID;
    protected int carID;
    protected Date serviceDate;
    protected String description;
    protected double cost;
    protected String status;
    protected String mechanic;
    
     private Maintenance(Builder builder){
        this.maintenanceID = builder.maintenanceID;
        this.carID = builder.carID;
        this.serviceDate = builder.serviceDate;
        this.description = builder.description;
        this.cost = builder.cost;
        this.status = builder.status;
        this.mechanic = builder.mechanic;
    }
    
    public int getMaintenanceId() {
        return maintenanceID;
    }
    
    public int getCarID() {
        return carID;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public String getStatus() {
        return status;
    }

    public String getMechanic() {
        return mechanic;
    }
    
    
    public static class Builder {
    private int maintenanceID;
    private int carID;
    private Date serviceDate;
    private String description;
    private double cost;
    private String status;
    private String mechanic;
    
    public Builder setMaintenanceID(int maintenanceID) {
        this.maintenanceID = maintenanceID;
        return this;
    }
    public Builder setCarID(int carID) {
        this.carID = carID;
        return this;
    }
    
    public Builder setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
        return this;
    }
    
    public Builder setDescription(String description) {
        this.description = description;
        return this;
    }
    
     public Builder setCost(double cost) {
        this.cost = cost;
        return this;
    }
     
    public Builder setStatus(String status) {
        this.status = status;
        return this;
    }
 
    public Builder setMechanic(String mechanic) {
        this.mechanic = mechanic;
        return this;
    }
    public Maintenance build() {
            return new Maintenance(this);
        }
    }
}