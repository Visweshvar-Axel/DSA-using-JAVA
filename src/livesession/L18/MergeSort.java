package livesession.L18;

public class MergeSort {
        // Merges two subarrays of arr[]
        void merge(int arr[], int l, int m, int r)
        {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;

            // Create temp arrays
            int L[] = new int[n1];
            int R[] = new int[n2];

            // Copy data to temp arrays
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];

            // Merge the temp arrays
            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of L[] if any
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            // Copy remaining elements of R[] if any
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        // Main function that sorts arr[l..r] using merge()
        int sort(int arr[], int l, int r,int count) {
            if (l < r) {
                // Find the middle point
                int m = (l + r) / 2;
                System.out.println(m);

                // Sort first and second
                sort(arr, l, m,count);
                sort(arr, m + 1, r,count);

                // Merge the sorted halves
                merge(arr, l, m, r);

            }
        }

        // print method
        static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Main method
        public static void main(String args[]) {
            int arr[] = {2, 34, 21, 54, 1, 234, 5, 6, 0, 12, 11, 13, 5, 6, 7 };
            System.out.println("Given Array");
            printArray(arr);

            MergeSort ob = new MergeSort();
            System.out.println("invoking count: "+ob.sort(arr, 0, arr.length - 1,0));

            System.out.println("\nSorted array");
            printArray(arr);
        }
}
