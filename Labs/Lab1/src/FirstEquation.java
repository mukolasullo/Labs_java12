public class FirstEquation {
    public static Double calculate(double s, int k) {
        if (k >= 35) throw new IllegalArgumentException("Incorrect value for argument k!!!");
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += Math.log10(Math.sqrt(s / (i * i))); // Перевірте формулу, щоб впевнитися, що вона правильна
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("First Equation Results:");

        double result1 = calculate(2, 5);
        System.out.printf("s: 2, k: 5 -> %.4f%n", result1);  // Вивід з точністю до 4 знаків

        double result2 = calculate(10, 10);
        System.out.printf("s: 10, k: 10 -> %.4f%n", result2); // Вивід з точністю до 4 знаків

        try {
            double result3 = calculate(1, 35);
            System.out.printf("s: 1, k: 35 -> %.4f%n", result3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
