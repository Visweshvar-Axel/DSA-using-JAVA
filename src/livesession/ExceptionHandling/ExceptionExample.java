package livesession.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
class pointer {
    int a = 0;
}
public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

        System.out.println("Enter values:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = a/b;
        System.out.println("the result : "+c);
        pointer obj = new pointer();
        obj = null;
        System.out.println(obj.a);
        } catch (InputMismatchException e) {
            System.out.println("provide double value input");
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
