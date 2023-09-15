import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Number to Letter Grade\n");
        Scanner in = new Scanner(System.in);
        System.out.print("What is your numeric grade?   ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        double x = in.nextDouble();
        if (x >= 92) {
            System.out.println("Your letter grade is an A");
        } else if (x < 92 && x >= 89) {
            System.out.println("Your letter grade is an A-");
        } else if (x < 89 && x >= 87) {
            System.out.println("Your letter grade is an B+");
        } else if (x < 87 && x >= 82) {
            System.out.println("Your letter grade is an B");
        } else if (x < 82 && x >= 79) {
            System.out.println("Your letter grade is an B-");
        } else if (x < 79 && x >= 77) {
            System.out.println("Your letter grade is an C+");
        } else if (x < 77 && x >= 72) {
            System.out.println("Your letter grade is an C");
        } else if (x < 72 && x >= 69) {
            System.out.println("Your letter grade is an C-");
        } else if (x < 69 && x >= 67) {
            System.out.println("Your letter grade is an D+");
        } else if (x < 67 && x >= 60) {
            System.out.println("Your letter grade is an D");
        } else if (60 > x) {
            System.out.println("Your letter grade is an F");
        }}}