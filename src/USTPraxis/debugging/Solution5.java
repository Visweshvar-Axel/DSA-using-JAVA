package USTPraxis.debugging;

public class Solution5 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(4)); // false
    }
}
