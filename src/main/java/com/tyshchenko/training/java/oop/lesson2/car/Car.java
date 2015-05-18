package com.tyshchenko.training.java.oop.lesson2.car;

/**
 * @author Alexander Tyshchenko.
 */
public class Car {
    //композиция (поля)
    private String name;
    private Engine engine;
    private Climate climate = new Climate();
    private double distance;

    public Car(String name) {
        this(name,0,1.0);
    }

    public Car(String name, double mileage, double engineVolume) {
        this.name = name;
        engine = new Engine(mileage,engineVolume);
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }

    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }

    public void turnOff() {
        climate.turnOff();
        engine.turnOff();
    }

    public void start(int speed, double hours) {
        if (engine.isStarted()) {
            this.distance = hours * speed;
            engine.addMileage(distance);
        }
    }

    public void showFuelSpent(){
        double fuelSpent = 0;
        if (engine.isStarted()){
            if (engine.getEngineVolume() >0 && engine.getEngineVolume()<=1.0){
                fuelSpent = 6*distance/100;
            }
            if (engine.getEngineVolume()>1 && engine.getEngineVolume()<=2.0){
                fuelSpent = 8*distance/100;
            }
            if (engine.getEngineVolume()>2 && engine.getEngineVolume()<=3.0){
                fuelSpent = 15*distance/100;
            }
        }
        System.out.println("Fuel spent = "+fuelSpent);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", climate=" + climate +
                '}';
    }
}
