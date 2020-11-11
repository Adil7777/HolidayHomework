import java.util.Scanner;

public class Eight {
    public void smallestLargest() {
        System.out.println("How many numbers do you want to enter");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int a[] = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.println("Number " + (i + 1));
            int b = scan.nextInt();
            a[i] = b;
        }

        int max = -10000, min = 10000;

        for (int i = 0; i < numbers; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
    }
}
