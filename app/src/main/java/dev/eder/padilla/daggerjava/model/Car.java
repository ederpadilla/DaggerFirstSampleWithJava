package dev.eder.padilla.daggerjava.model;

public class Car {

    private Motor motor;

    public Car(Motor motor) {
        this.motor = motor;
    }

    public String getMotor(){
        return ("Coche con "+motor.getTipoMotor());
    }

}
