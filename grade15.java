import java.util.Scanner;

public class grade15 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("ใส่คะแนน: ");
            int score = scanner.nextInt();
            String grade = "";

            if (score >= 50) {
                if (score >= 60) {
                    if (score >= 70) {
                        if (score >= 80) {
                            grade = "A";
                        } else {
                            grade = "B";
                        }
                    } else {
                        grade = "C";
                    }
                } else {
                    grade = "D";
                }
            } else {
                grade = "F";
            }

            if (score >= 55 && score < 60) {
                grade = "D+";
            } else if (score >= 65 && score < 70) {
                grade = "C+";
            } else if (score >= 75 && score < 80) {
                grade = "B+";
            }

            System.out.println("เกรดของคุณคือ: " + grade);
        }
    }
}
