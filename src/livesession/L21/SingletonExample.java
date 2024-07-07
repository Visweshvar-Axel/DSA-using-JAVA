package livesession.L21;

class Singleton{
    private static Singleton obj;
    private String name;
    private Singleton(){}
    public static Singleton getObj(){
        if (obj == null) return obj = new Singleton();
        else return obj;
    }
    public void sayHi(){
        System.out.println("hi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class SingletonExample {
    public static void main(String[] args) {
        Singleton s = Singleton.getObj();
        s.sayHi();
        s.setName("viswa");
        System.out.println(s.getName());
        Singleton s1 = Singleton.getObj();
        System.out.println(s1.getName());
    }
}
