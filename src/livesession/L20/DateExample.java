package livesession.L20;

import java.time.LocalTime;

public final class DateExample extends SealedClassExample{
    @Override
    public int fact(int num) {
        return 0;
    }

    @Override
    public LocalTime getNow() {
        return LocalTime.now();
    }
}
