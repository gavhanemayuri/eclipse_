import java.util.Random;

public class QuickSort {

    // Quick Sort method
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    // Partition method
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];   // Last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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

            quickSort(arr, 0, n - 1);

            long endTime = System.nanoTime();

            double timeTaken = (endTime - startTime) / 1_000_000.0;

            System.out.println("Number of elements: " + n);
            System.out.println("Time taken: " + timeTaken + " ms\n");
        }
    }
}