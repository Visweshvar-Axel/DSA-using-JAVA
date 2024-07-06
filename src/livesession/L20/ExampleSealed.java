package livesession.L20;

import java.time.LocalTime;

public final class ExampleSealed extends SealedClassExample {
    public int fact(int num) {
        return (num==1)? num : num*fact(num-1);
    }

    @Override
    public LocalTime getNow() {
        return null;
    }
}
