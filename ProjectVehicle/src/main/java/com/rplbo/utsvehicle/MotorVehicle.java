package com.rplbo.utsvehicle;

public abstract class MotorVehicle {
    private String vehicleName;
    private Engine engine;
    private Tire tire;
    private Wheel wheel;
    private Transmision transmision;

    public MotorVehicle(Engine engine, Transmision transmision , Tire tire, Wheel wheel) {
        this.engine = engine;
        this.tire = tire;
        this.wheel = wheel;
        this.transmision = transmision;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Transmision getTransmition() {
        return transmision;
    }

    public void setTransmition(Transmision transmision) {
        this.transmision = transmision;
    }

    public abstract void backWard();

    public abstract void brake();

    public abstract void forward();

    public abstract void turnLeft();

    public abstract void turnRight();
}
