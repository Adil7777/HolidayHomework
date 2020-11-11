public class PpOne {
    String s = "";

    public void romanNumerals(int n) {
        int a = n / 10, b = n % 10;

        if (n >= 100 && n < 500) {
            int c = n / 100;
            for(int i = 0; i < c; i++){
                s += "C";
            }
        } else if (n >= 50 && n < 100) {
            s += "L";
        } else if (n >= 10 && n < 50) {
            for (int i = 0; i < a; i++) {
                s += "X";
            }
        }
        if (b <= 3) {
            for (int i = 0; i < b; i++) {
                s += "I";
            }
        } else if (b == 4) {
            s += "IV";
        } else {
            s += "V";

            b -= 5;
            for (int i = 0; i < b; i++) {
                s += "I";
            }
        }
    }
}
