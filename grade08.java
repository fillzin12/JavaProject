import java.util.Scanner;

public class grade08 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your score: ");
            int score = scanner.nextInt();
            String grade;

            if (score >= 70) {
                if (score >= 75) {
                    if (score >= 80) {
                        grade = "A";
                    } else {
                        grade = "B+";
                    }
                } else {
                    grade = "B";
                }
            } else if (score >= 60) {
                if (score >= 65) {
                    grade = "C+";
                } else {
                    grade = "C";
                }
            } else if (score >= 50) {
                if (score >= 55) {
                    grade = "D+";
                } else {
                    grade = "D";
                }
            } else {
                grade = "F";
            }

            System.out.println("Your grade is: " + grade);
        }
    }
}