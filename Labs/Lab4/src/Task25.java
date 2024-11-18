public class Task25 {
    public static int findSecondMinAbs(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : array) {
            int absValue = Math.abs(num);
            if (absValue < min) {
                secondMin = min;
                min = absValue;
            } else if (absValue < secondMin && absValue != min) {
                secondMin = absValue;
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("No second minimum found.");
        }
        return secondMin;
    }

    public static void main(String[] args) {
        int[] array = {3, -7, 2, -2, 9, -1};
        System.out.println("Second minimum by absolute value: " + findSecondMinAbs(array));
    }
}
