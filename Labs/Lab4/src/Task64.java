public class Task64 {
    public static int[] transformArray(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null.");
        }
        int[] transformed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                transformed[i] = -array[i];
            } else if (array[i] > 0) {
                transformed[i] = array[i] - 3;
            } else {
                transformed[i] = -2;
            }
        }
        return transformed;
    }

    public static void main(String[] args) {
        int[] array = {-5, 0, 6, -1, 3};
        int[] transformed = transformArray(array);
        System.out.print("Transformed array: ");
        for (int num : transformed) {
            System.out.print(num + " ");
        }
    }
}
