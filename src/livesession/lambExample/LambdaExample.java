package livesession.lambExample;

interface OddOrEven {
    boolean isOdd(int n);
}
public class LambdaExample {
    public static void main(String[] args) {
        OddOrEven ref = (int n) -> (n&1) == 1;
        System.out.println(ref.isOdd(3));
        System.out.println(ref.isOdd(2));
        System.out.println(ref.isOdd(6));
        System.out.println(ref.isOdd(5));
    }
}
