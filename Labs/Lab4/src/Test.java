public class Test {
    public static void main(String[] args) {
        int [] array = {4, 2, 7,2, 9, 3};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {min = array[i];
            }
        }
   System.out.println(min);
    }
}
