import java.util.Scanner;

public class grade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("ใส่คะแนน: ");
            int score = scanner.nextInt();
            String grade = "F";

            if (score >= 50) {
                grade = "D";
                if (score >= 55) grade = "D+";
                if (score >= 60) grade = "C";
                if (score >= 65) grade = "C+";
                if (score >= 70) grade = "B";
                if (score >= 75) grade = "B+";
                if (score >= 80) grade = "A";
            }

            System.out.println("เกรดคุณคือ: " + grade);
        }
    }
}
