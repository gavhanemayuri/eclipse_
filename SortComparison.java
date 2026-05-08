import java.util.*;

public class SortComparison {

    // Utility methods
    public static int[] generateArray(int n) {
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = r.nextInt(100000);
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Heap Sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Radix Sort
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main Method
    public static void main(String[] args) {
        int n = 10000; // change size here

        int[] original = generateArray(n);

        int[] arr1 = copyArray(original);
        int[] arr2 = copyArray(original);
        int[] arr3 = copyArray(original);
        int[] arr4 = copyArray(original);

        // Selection Sort
        long start = System.nanoTime();
        selectionSort(arr1);
        long end = System.nanoTime();
        System.out.println("Selection Sort Time: " + (end - start) + " ns");

        // Insertion Sort
        start = System.nanoTime();
        insertionSort(arr2);
        end = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (end - start) + " ns");

        // Heap Sort
        start = System.nanoTime();
        heapSort(arr3);
        end = System.nanoTime();
        System.out.println("Heap Sort Time: " + (end - start) + " ns");

        // Radix Sort
        start = System.nanoTime();
        radixSort(arr4);
        end = System.nanoTime();
        System.out.println("Radix Sort Time: " + (end - start) + " ns");
    }
}