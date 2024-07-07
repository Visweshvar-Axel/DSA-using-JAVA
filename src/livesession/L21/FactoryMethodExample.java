package livesession.L21;
interface Cat {
    public void sounds();
}
class whiteCat implements Cat {
    @Override
    public void sounds() {
        System.out.println("white cat: meow..!");
    }
}
class blackCat implements Cat {
    @Override
    public void sounds() {
        System.out.println("black cat: meow..!");
    }
}
class greenCat implements Cat {
    @Override
    public void sounds() {
        System.out.println("green cat: meow..!");
    }
}
class CatFactory{
    public Cat createCat(String name){
        switch (name.toLowerCase()){
            case "whitecat":
                return new whiteCat();
            case "blackcat":
                return new blackCat();
            case "greencat":
                return new greenCat();
            default:
                throw new IllegalArgumentException("no such cat found...!");
        }
    }
}
public class FactoryMethodExample {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        try {
            Cat tom = catFactory.createCat("whitecat");
            tom.sounds();
            tom = catFactory.createCat("BLACKcat");
            tom.sounds();
            tom = catFactory.createCat("redcat");
            tom.sounds();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
