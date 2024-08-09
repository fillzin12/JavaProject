import java.util.Scanner;

public class grade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your score: ");
            int score = scanner.nextInt();
            String grade;

            if (score >= 90) {
                grade = "A+";
                System.out.println("Your grade is: " + grade + " (OMG)");
            } else if (score >= 80) {
                grade = "A";
                System.out.println("Your grade is: " + grade + " (WELL WELL WELL)");
            } else if (score >= 75) {
                grade = "B+";
                System.out.println("Your grade is: " + grade + " (Good)");
            } else if (score >= 70) {
                grade = "B";
                System.out.println("Your grade is: " + grade + " (It ok)");
            } else if (score >= 65) {
                grade = "C+";
                System.out.println("Your grade is: " + grade + " (Nice)");
            } else if (score >= 60) {
                grade = "C";
                System.out.println("Your grade is: " + grade + " (Ok)");
            } else if (score >= 55) {
                grade = "D+";
                System.out.println("Your grade is: " + grade + " (Not Bad)");
            } else if (score >= 50) {
                grade = "D";
                System.out.println("Your grade is: " + grade + " (Almost)");
            } else {
                grade = "F";
                System.out.println("Your grade is: " + grade + " (Try Later)");
            }
        } while (true);

    }
}
