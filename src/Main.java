import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

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
abstract class Product {
    public int price;

    Product() {
        price = 60;
    }

    abstract public void setPrice(int price);
    abstract public void getPrice();
}

class Test extends Product {
    public void setPrice(int price) {
        this.price = price;
    }

    public void getPrice() {
        System.out.println("Price: " + price);
    }

//    public static void main(String[] args) {
//        Test obj = new Test();
//        obj.setPrice(40);
//        obj.getPrice();
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

        Class1 b = new Class2();;

        b.show();

        Student s = new Student();
        System.out.println(s.marks);

        System.out.println(12_34_34);

        Foo foo = new Bar(); // Line 2
        foo.print(); // Line 3

        TreeMap<Integer, String> stu = new TreeMap<>();

        stu.put(3, "Jack");

        stu.put(6, "Kim");

        stu.put(3, "John");

        stu.put(7, "Amy");

        System.out.println(stu.keySet());

        List<Integer> rollNumberList = new ArrayList<>();
        rollNumberList.add(1);
        rollNumberList.add(2);
        rollNumberList.add(5);
        rollNumberList.add(4);
        rollNumberList.add(2);
        rollNumberList.add(8);

        rollNumberList.sort((Integer roll1, Integer roll2) -> -roll1.compareTo(roll2));
//        rollNumberList.sort((roll1, roll2) -> {roll1.compareTo(roll2)});

        System.out.println(rollNumberList);

        Test obj = new Test();
        obj.setPrice(40);
        obj.getPrice();

        String s1 = "James";

        StringBuilder s2 = new StringBuilder("James");
        StringBuffer s3 = new StringBuffer("James");

        System.out.println(s1 == s2.toString());

        System.out.println(s1 == s3.toString());


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