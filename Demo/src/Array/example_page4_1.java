package Array;
import java.util.Scanner;
public class example_page4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        double[] Score = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input Score: ");
            Score[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Score: " + Score[i]);
        }
        double totalScore = 0;
        for (int i = 0; i < n; i++) {
            totalScore += Score[i];
        }
        double average = totalScore / n;
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            if (Score[i] >= 90 && Score[i] <= 100) {
                grades[i] = 'A';
            } else if (Score[i] >= 80 && Score[i] < 90) {
                grades[i] = 'B';
            } else if (Score[i] >= 70 && Score[i] < 80) {
                grades[i] = 'C';
            } else if (Score[i] >= 60 && Score[i] < 70) {
                grades[i] = 'D';
            } else if (Score[i] >= 50 && Score[i] < 60) {
                grades[i] = 'E';
            } else {
                grades[i] = 'F';
            }
        }
        System.out.println("\nTotal Score: " + totalScore);
        System.out.println("Average: " + average);
        for (int i = 0; i < n; i++) {
            System.out.println(" Grade: " + grades[i]);
        }
    }
}