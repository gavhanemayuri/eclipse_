import java.util.Random;

public class MergeSort {

    // Merge Sort method
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two subarrays
    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Remaining elements
        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Generate random array
    static int[] generateArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100000);
        }

        return arr;
    }

    // Main method
    public static void main(String[] args) {

        int[] sizes = {1000, 5000, 10000, 20000};

        for (int n : sizes) {

            int[] arr = generateArray(n);

            long startTime = System.nanoTime();

            mergeSort(arr, 0, n - 1);

            long endTime = System.nanoTime();

            double timeTaken = (endTime - startTime) / 1_000_000.0;

            System.out.println("Number of elements: " + n);
            System.out.println("Time taken: " + timeTaken + " ms\n");
        }
    }
}