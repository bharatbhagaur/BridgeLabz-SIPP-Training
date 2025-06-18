import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    j--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = sum / 3.0;
            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 80) grade[i] = "B";
            else if (percent[i] >= 70) grade[i] = "C";
            else if (percent[i] >= 60) grade[i] = "D";
            else grade[i] = "F";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2] + " Percentage: " + percent[i] + " Grade: " + grade[i]);
        }
    }
}
