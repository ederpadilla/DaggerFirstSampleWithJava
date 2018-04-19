package dev.eder.padilla.daggerjava.di;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dev.eder.padilla.daggerjava.model.Car;
import dev.eder.padilla.daggerjava.model.Motor;

@Module
public class MotorModule {
    @Singleton
    @Named("diesel")
    @Provides
    public Motor providesMotorDiesel(){
        return new Motor("diesel");
    }
    @Named("gasolina")
    @Provides
    public Motor providesMotorGasolina(){
        return new Motor("gasolina");
    }
    @Provides
    public Car providesCar(@Named("diesel") Motor motor){return new Car(motor);}

}
