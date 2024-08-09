import java.util.Scanner;

public class grade20 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("ใส่คะแนน: ");
            int score = scanner.nextInt();
            String grade = "";

            if (score >= 80) {
                grade = "A";
            } else {
                if (score >= 75) {
                    grade = "B+";
                } else {
                    if (score >= 70) {
                        grade = "B";
                    } else {
                        if (score >= 65) {
                            grade = "C+";
                        } else {
                            if (score >= 60) {
                                grade = "C";
                            } else {
                                if (score >= 55) {
                                    grade = "D+";
                                } else {
                                    if (score >= 50) {
                                        grade = "D";
                                    } else {
                                        grade = "F";
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("เกรดคุณคือ: " + grade);
        }
    }
}
