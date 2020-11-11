import java.util.Scanner;

public class Eleven {
    String longest = "";

    public void longestName(Scanner console, int num) {
        for (int i = 0; i < num; i++) {
            String a = console.next();

            if (longest.length() > a.length()) {
                longest = a;
            }
        }

        String result = longest.substring(0, 1).toUpperCase() + longest.substring(1).toLowerCase();

        System.out.println(result + "'s" + " name is longest");

    }
}
