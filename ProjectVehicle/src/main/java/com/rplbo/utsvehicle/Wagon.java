package com.rplbo.utsvehicle;

public class Wagon implements Vehicle{
    private String pullers;
    private Wheel wheel;

    public Wagon(String pullers, Wheel wheel) {
        this.pullers = pullers;
        this.wheel = wheel;
    }

    public String getPullers() {
        return pullers;
    }

    public void setPullers(String pullers) {
        this.pullers = pullers;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public void backward() {

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
