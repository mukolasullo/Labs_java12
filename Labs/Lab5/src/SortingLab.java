import java.util.Arrays;

public class SortingLab {
    public static void main(String[] args) {
        // Приклад масиву
        double[] array = {3.2, 1.5, 4.8, 2.9, 0.1};

        // Bubble Sort
        double[] bubbleSortedArray = array.clone();
        bubbleSort(bubbleSortedArray);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSortedArray));

        // Selection Sort
        double[] selectionSortedArray = array.clone();
        selectionSort(selectionSortedArray);
        System.out.println("Selection Sort: " + Arrays.toString(selectionSortedArray));
    }

    // Реалізація Bubble Sort
    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Реалізація Selection Sort
    public static void selectionSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
