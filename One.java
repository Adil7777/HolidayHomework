public class One {
    int sum = 0;

    public int fractionSum(int n) {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * 2;
    }
}
