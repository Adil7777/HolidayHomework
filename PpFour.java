public class PpFour {
    int today = 0, first, second;

    public void birthday(int m1, int d1, int m2, int d2) {

        if (m1 == 2) {
            first = 31 + 28 + d1;
        } else if (m1 <= 7) {
            for (int i = 1; i <= m1; i++) {
                if (i == 2) {
                    first += 28;
                } else if (i % 2 == 1) {
                    first += 31;
                } else {
                    first += 30;
                }
            }
            first += d1;
        } else if (m1 >= 8) {
            for (int i = 8; i <= m1; i++) {
                if (i % 2 == 1) {
                    first += 30;
                } else {
                    first += 31;
                }
            }
            first += d1;
        }

        if (m2 == 2) {
            second = 31 + 28 + d1;
        } else if (m2 <= 7) {
            for (int i = 1; i <= m2; i++) {
                if (i == 2) {
                    second += 28;
                } else if (i % 2 == 1) {
                    second += 31;
                } else {
                    second += 30;
                }
            }
            second += d2;
        } else if (m2 >= 8) {
            for (int i = 8; i <= m2; i++) {
                if (i % 2 == 1) {
                    second += 30;
                } else {
                    second += 31;
                }
            }
            second += d2;
        }

        if (first < second) {
            System.out.print("First");
        } else if (first == second){
            System.out.print("Tie");
        } else{
            System.out.print("Second");
        }

    }
}
