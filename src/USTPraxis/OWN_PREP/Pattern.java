package USTPraxis.OWN_PREP;

public class Pattern {
    private static void pattern1(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= n; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    private static void pattern3(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static void pattern5(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = (i%2 == 0)? 0 : 1;
            for(int j = 1;j <= i; j++){
                System.out.print(f+" ");
                if(f == 1) f = 0;
                else f = 1;
            }
            System.out.println();
        }
    }
    private static void pattern6(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= i; j++){
                System.out.print(num+++" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("\nPattern 1\n");
        pattern1(5);
        System.out.println("\nPattern 2\n");
        pattern2(4);
        System.out.println("\nPattern 3\n");
        pattern3(5);
        System.out.println("\nPattern 4\n");
        pattern4(5);
        System.out.println("\nPattern 5\n");
        pattern5(5);
        System.out.println("\nPattern 6\n");
        pattern6(5);
        int n =5;
        for (int i = 0; i < n ; i++) {
            System.out.println("*".repeat(n-i)+" ".repeat(i*2)+"*".repeat(n-i));
        }
        for (int i = 0; i < n ; i++) {
            System.out.println("*".repeat(i+1)+" ".repeat((n-1-i)*2)+"*".repeat(i+1));
        }

    }

}
