package hw.one;

public class PowNumber {
    public static double sqrtNum(int number) {
        return number * number;
    }

    public static double cubeNum(int number) {
        return number * number * number;
    }

    public static double powNum(int number, int pow) {
        double result = 1;
        if (pow > 0) {
            for (int i = pow; i > 0; i--) {
                result *= number;
            }
        } else if (pow < 0) {
            for (int i = pow; i < 0; i++) {
                result /= number;
            }
        }
        return result;
    }
}
