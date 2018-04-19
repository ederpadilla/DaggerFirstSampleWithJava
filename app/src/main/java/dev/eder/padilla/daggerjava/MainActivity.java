package dev.eder.padilla.daggerjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

import dev.eder.padilla.daggerjava.model.Car;
import dev.eder.padilla.daggerjava.model.Motor;

public class MainActivity extends AppCompatActivity {

    @Named("gasolina")
    @Inject
    Motor motor;

    @Inject
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MotorApplication)getApplication()).getMotorComponent().inject(this);
        Toast.makeText(this, motor.getTipoMotor(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, car.getMotor(), Toast.LENGTH_SHORT).show();
    }
}
