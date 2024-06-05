package livesession.oops;

public class pet {
    private String name;
    private String breed;
    private int age;
    private int legs;

    public String getName() {
        return name;
    }

    public pet(String name, String breed, int age, int legs) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.legs = legs;
    }
    @Override
    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                '}';
    }
}
