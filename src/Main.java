import java.util.ArrayList;
import java.util.List;

interface Foo {
    String name = "Foo";
    void print();
}

class Bar implements Foo {
    String name = "Bar";

    public void print() {
        System.out.println(name); // Line 1
    }

//    public static void main(String[] args) {
//        Foo foo = new Bar(); // Line 2
//        foo.print(); // Line 3
//    }
}

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        for (;;) {
//            System.out.println("viswa");
//        }

//        do {
//            System.out.println("viswa");
//        }while (true);

//        Foo foo = new Bar(); // Line 2
//        foo.print(); // Line 3


//        List<String> str = new ArrayList<String>();
//        str.add("Tom");
//        str.add("Harry");
//        str.add("John");
//
//        List<Object> obj = str;
//        obj.add(new Object());
//
//        String name = str.get(0);
//        System.out.println(name);

    }
}