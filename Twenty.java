public class Twenty {
    int sum = 0;

    public int numUnique(int a, int b, int c) {
        if (a != b) sum += 1;
        else if (a != c) sum += 1;
        else if (b != c) sum += 1;

        return sum;
    }
}
