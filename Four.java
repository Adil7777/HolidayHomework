public class Four {
    public int daysInMonth(int m) {
        if (m == 2) {
            return 28;
        } else if (m <= 7) {
            if (m % 2 == 1) {
                return 31;
            }
            return 30;
        } else {
            if (m % 2 == 0) {
                return 31;
            }
        }
        return 30;
    }
}
