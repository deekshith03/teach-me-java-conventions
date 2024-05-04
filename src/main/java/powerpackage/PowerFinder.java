package powerpackage;

public class PowerFinder {
    public static int of(int base, int exponent) {
        int result = 1;
        for (int power = 0; power<exponent; power++) {
            result *= base;
        }
        return result;
    }
}