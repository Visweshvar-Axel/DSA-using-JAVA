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

    }
}
