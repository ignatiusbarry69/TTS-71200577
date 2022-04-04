package com.rplbo.utsvehicle;

public class Bus extends MotorVehicle{
    private int numPassenger;

    public Bus(Engine engine, Transmision transmision, Tire tire, Wheel wheel, int numPassenger) {
        super(engine, transmision, tire, wheel);
        this.numPassenger = numPassenger;
    }

    @Override
    public void backWard() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void forward() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
