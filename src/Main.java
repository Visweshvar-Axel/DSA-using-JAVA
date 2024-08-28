import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        for (;;) {
//            System.out.println("viswa");
//        }

//        do {
//            System.out.println("viswa");
//        }while (true);

        List<String> str = new ArrayList<String>();
        str.add("Tom");
        str.add("Harry");
        str.add("John");

        List<Object> obj = str;
        obj.add(new Object());

        String name = str.get(0);
        System.out.println(name);

    }
}