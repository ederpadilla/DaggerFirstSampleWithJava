package dev.eder.padilla.daggerjava.di;

import dagger.Component;
import dev.eder.padilla.daggerjava.MainActivity;
@PerActivity
@Component(modules={MotorModule.class})
public interface MotorComponent {
        void inject(MainActivity mainActivity);
}
