package livesession.L20;

import java.time.LocalDate;

public class SealedAndDateMain {
    public static void main(String[] args) {
        DateExample dt = new DateExample();
        System.out.println(dt.getNow());

        ExampleSealed fac = new ExampleSealed();
        System.out.println(fac.fact(5));

        //date and time``

        System.out.println(LocalDate.ofYearDay(2001,132));
        System.out.println(LocalDate.of(2001,5,12));
        System.out.println(LocalDate.now());
    }
}
