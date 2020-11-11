import java.util.Scanner;

public class Ten {
    public void printGPA() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a student record: ");
        String name = scan.next();
        int n = scan.nextInt(), sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scan.nextInt();
        }

        System.out.println(name + "'s grade is " + sum / n);
    }
}
