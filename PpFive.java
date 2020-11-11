import java.util.Scanner;

public class PpFive {
    public void grade(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input how many homeworks have student done");
        int hwDone = scan.nextInt();
        System.out.println("Input how many homeworks ");
        int hwAll = scan.nextInt();
        System.out.println("Input percentage of midterm exam");
        int midTerm = scan.nextInt();
        System.out.println("Input percentage of final exam");
        int finalExam = scan.nextInt();

        double percentageHw = (double) (hwDone / hwAll);
        System.out.println("Student's average score : " + (((double) midTerm + (double) finalExam + percentageHw) / 3));
    }
}
