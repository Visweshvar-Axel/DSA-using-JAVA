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

class Student {
    public int marks;
}
class Class1 {

    public static void show() {

        System.out.println("In Class1::show()");

    }

}

class Class2 extends Class1 {

    public static void show() {

        System.out.println("In Class2::show()");

    }
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

        Class1 b = new Class2();;

        b.show();

        Student s = new Student();
        System.out.println(s.marks);

        System.out.println(12_34_34);

        Foo foo = new Bar(); // Line 2
        foo.print(); // Line 3


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