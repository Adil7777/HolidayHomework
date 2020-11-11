public class Five{
    int result = 1;

    public int pow(int a, int b) {
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
