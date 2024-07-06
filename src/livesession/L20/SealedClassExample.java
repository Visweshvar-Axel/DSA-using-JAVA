package livesession.L20;

import java.time.LocalTime;

public sealed abstract class SealedClassExample permits ExampleSealed, DateExample {
    public abstract int fact(int num);
    public abstract LocalTime getNow();
}
