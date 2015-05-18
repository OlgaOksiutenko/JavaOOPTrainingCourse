package com.tyshchenko.training.java.oop.lesson2.car;

/**
 * @author Alexander Tyshchenko.
 */
public class Engine {
    private double mileage;
    private boolean started;
    private double engineVolume;
    private double fuelPerMiles;

    public Engine(double mileage, double engineVolume) {
        this.mileage = mileage;
        this.engineVolume = engineVolume;
    }

    public double getMileage() {
        return mileage;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public void showSpentFuel(double fuelPerMiles, double mileage){
        double fuelSpent;
        if(started){
           fuelSpent = fuelPerMiles*mileage/100;
            System.out.println("Fuel was spent = "+fuelSpent);
        }

    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "mileage=" + mileage +
                ", started=" + started +
                '}';
    }
}
