import java.util.Scanner;

public class grade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("ใส่คะแนน: ");
            int score = scanner.nextInt();
            String grade = "";

            if (score < 50) {
                grade = "F";
            } else {
                if (score < 55) {
                    grade = "D";
                } else {
                    if (score < 60) {
                        grade = "D+";
                    } else {
                        if (score < 65) {
                            grade = "C";
                        } else {
                            if (score < 70) {
                                grade = "C+";
                            } else {
                                if (score < 75) {
                                    grade = "B";
                                } else {
                                    if (score < 80) {
                                        grade = "B+";
                                    } else {
                                        grade = "A";
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("เกรดของคุณคือ: " + grade);
        }
    }
}
