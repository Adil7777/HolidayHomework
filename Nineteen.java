public class Nineteen {
    String s = "";

    public String quadrant(int x, int y) {
        if (x > 0) {
            if (y > 0) s = "first";
            else s = "fourth";
        } else if (x < 0) {
            if (y > 0) s = "second";
            else s = "third";
        }
        return s;
    }
}
