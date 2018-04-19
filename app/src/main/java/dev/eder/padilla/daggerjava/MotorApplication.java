package dev.eder.padilla.daggerjava;

import android.app.Application;

import dev.eder.padilla.daggerjava.di.DaggerMotorComponent;
import dev.eder.padilla.daggerjava.di.MotorComponent;
import dev.eder.padilla.daggerjava.di.MotorModule;

public class MotorApplication extends Application {
    private MotorComponent motorComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        motorComponent = DaggerMotorComponent.builder().motorModule(new MotorModule()).build();
    }

    public MotorComponent getMotorComponent() {
        return motorComponent;
    }
}