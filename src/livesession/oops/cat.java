package livesession.oops;

public class cat extends pet{
    private String color;

    public cat(String name, String breed, int age, int legs, String color) {
        super(name, breed, age, legs);
        this.color = color;
    }
    @Override
    public String toString() {
        return "cat{" +
                "color='" + color + '\'' +
                '}';
    }
    public static void main(String[] args) {
        cat obj1 = new cat("Atiya","indian",2,4,"white");
        cat obj2 = new cat("Ax","indian",3,4,"white");
        System.out.println(obj1.toString());
        System.out.println(obj1.getName());
        System.out.println(obj2.toString());
        System.out.println(obj2.getName());
    }
}
