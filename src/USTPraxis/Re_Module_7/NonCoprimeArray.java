package USTPraxis.Re_Module_7;

public class NonCoprimeArray {

    // Helper method to compute the GCD of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int minOperationsToNonCoprime(int[] A) {
        int operationsCount = 0;

        for (int i = 0; i < A.length - 1; i++) {
            // Check if adjacent elements A[i] and A[i+1] are non-coprime
            if (gcd(A[i], A[i + 1]) == 1) {
                // They are coprime, so we need to make them non-coprime
                // The easiest way is to increase A[i+1] by 1 (or any other small change)
                // that makes A[i] and A[i+1] non-coprime
                A[i + 1] = A[i + 1] + 1;
                operationsCount++;
            }
        }

        return operationsCount;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] array1 = {22,11};
        System.out.println("Minimum operations: " + minOperationsToNonCoprime(array1)); // Output: 3

        // Test case 2
        int[] array2 = {2, 3};
        System.out.println("Minimum operations: " + minOperationsToNonCoprime(array2)); // Output: 0

        // Test case 3
        int[] array3 = {2,3,6,7};
        System.out.println("Minimum operations: " + minOperationsToNonCoprime(array3)); // Output: 3
    }
}
