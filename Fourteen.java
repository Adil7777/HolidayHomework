public class Fourteen {
    double result = 1.0;
    int c;

    public double pow2(double a, int b) {
        c = b;
        if (c < 0) c *= -1;
        for (int i = 0; i < c; i++) {
            result *= a;
        }

        if (b < 0) return 1 / result;
        return result;
    }
}
