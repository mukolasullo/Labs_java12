import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] array = {1, 2 ,3 ,4, 5};
        // Метод toString
        System.out.println("Масив" + Arrays.toString(array));
        // Метод for
        System.out.print("Масив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //Метод for-each
        System.out.print("Масив:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
