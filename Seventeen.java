public class Seventeen {
    public String stutter(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = 0; i <= ch.length - 1; i++) {
            rev += ch[i] * 2;
        }

        return rev;
    }
}
