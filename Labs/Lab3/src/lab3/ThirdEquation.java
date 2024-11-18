package lab3;

public class ThirdEquation {
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static Double calculate(double e) {
        if (e <= 0) throw new IllegalArgumentException("Incorrect value for argument e!!!");
        double sum = 0;
        int i = 1;

        while (true) {
            double current = Math.pow(-1, i) / calculateFactorial(i);
            if (Math.abs(current) < e) {
                break;
            }
            sum += current;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Third Equation Results:");

        double result1 = calculate(0.1);
        System.out.printf("e: 0.1 -> %.6f%n", result1); // Вивід з точністю до 6 знаків

        double result2 = calculate(0.01);
        System.out.printf("e: 0.01 -> %.6f%n", result2); // Вивід з точністю до 6 знаків

        try {
            double result3 = calculate(-0.1);
            System.out.printf("e: -0.1 -> %.6f%n", result3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
