package Laba2;

public class Main {

    // Метод для обчислення першого виразу 5
    public static float calculateFirst(double a, double b, double c, double d) {
        return 2 * (float) Math.sqrt((Math.sin(a) / Math.sqrt(Math.abs(Math.tan(b - a)))) + (Math.log(c) / d));
    }

    // Метод для обчислення другого виразу 14
    public static double calculateSecond(double a, double b, double c, double d) {
        return 2 * Math.cos(Math.pow(a, b)) + Math.abs(Math.acos(-Math.sqrt(c / d)));
    }

    // Метод для обчислення третього виразу 23
    public static double calculateThird(double a, double b, double c, double d) {
        double firstPart = (5 * c) / Math.cos(a);
        double secondPart = Math.sqrt(Math.sinh(Math.abs(b) * c) / Math.tan(d));
        return firstPart + secondPart;
    }

    public static void main(String[] args) {
        // Вхідні дані для першого виразу 5
        double a1 = 1.54, b1 = 0.49, c1 = 24.1, d1 = 0.87;
        double y1 = calculateFirst(a1, b1, c1, d1);
        System.out.println("Значення y для першого виразу: " + y1);

        // Вхідні дані для другого виразу 14
        double a2 = 2.54, b2 = 1.23, c2 = -2.14, d2 = -0.23;
        double y2 = calculateSecond(a2, b2, c2, d2);
        System.out.println("Значення y для другого виразу: " + y2);

        // Вхідні дані для третього виразу 23
        double a3 = -3.45, b3 = -2.34, c3 = 1.45, d3 = 0.83;
        double y3 = calculateThird(a3, b3, c3, d3);
        System.out.println("Значення y для третього виразу: " + y3);
    }
}
