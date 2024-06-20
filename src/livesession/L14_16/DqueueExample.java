package livesession.L14_16;

import java.util.ArrayDeque;

public class DqueueExample {
    public static void main(String[] args) {
        ArrayDeque<String> names = new ArrayDeque<>();
        names.add("Viswa");
        names.add("Saran");
        names.add("Jeswin");
        names.add("Janani");
        names.add("Dinesh");
        System.out.println(names);
        names.add("Dinesh");
        System.out.println(names);
        names.removeFirst();
        System.out.println(names);
        names.removeFirst();
        System.out.println(names);
        names.removeFirst();
        System.out.println(names);
    }
}
