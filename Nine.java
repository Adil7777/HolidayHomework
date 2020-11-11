import java.util.Scanner;

public class Nine {
    public void evenSumMax() {
        System.out.println("How many integers?");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int a[] = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.println("Next integer? ");
            int b = scan.nextInt();
            a[i] = b;
        }

        int max = -10000, sum = 0;

        for (int i = 0; i < numbers; i++) {
            if (a[i] % 2 == 1) a[i] = 0;
        }

        for (int i = 0; i < numbers; i++) {
            sum += a[i];

            if (a[i] > max) max = a[i];
        }

        System.out.println("Even sum = " + sum + " , Even max = " + max);
    }
}
