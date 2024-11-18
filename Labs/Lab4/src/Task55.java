public class Task55 {
    public static int countPositiveAtMultipleOfFour(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null.");
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 4 == 0 && array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, 6, 7, 8, 9, 10};
        System.out.println("Count of positive elements at indices multiple of 4: " + countPositiveAtMultipleOfFour(array));
    }
}
