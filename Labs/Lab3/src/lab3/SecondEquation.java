package lab3;

public class SecondEquation {
    public static double calculate(int t, int n) {
        if (t <= 0) throw new IllegalArgumentException("Value for t must be greater than zero!");

        double sum = 0;
        for (int l = 1; l <= n; l++) {
            if (l % 2 == 1) {
                sum += Math.sqrt(t * l); // Для непарних l
            } else {
                sum += l / Math.sqrt(t); // Для парних l
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Second Equation Results:");

        double result1 = calculate(2, 6);
        System.out.printf("t: 2, n: 6 -> %.4f%n", result1);  // Вивід з точністю до 4 знаків

        double result2 = calculate(4, 4);
        System.out.printf("t: 4, n: 4 -> %.4f%n", result2); // Вивід з точністю до 4 знаків

        try {
            double result3 = calculate(-1, 5);
            System.out.printf("t: -1, n: 5 -> %.4f%n", result3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
