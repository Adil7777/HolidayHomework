public class Twelve {
    public void printTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if ((a == b && b != c) || (b == c && a != c) || (a == c && c != b)) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }

        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException();
        }
    }
}
