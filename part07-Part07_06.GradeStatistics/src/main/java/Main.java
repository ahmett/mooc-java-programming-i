
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();
        ArrayList<Integer> passingPoints = new ArrayList<>();
        String[] grades = new String[6];
        Arrays.fill(grades, "");

        System.out.println("Enter point totals, -1 stops:");

        while(true) {
            int point = Integer.parseInt(scanner.nextLine());

            if (point == -1) {
                break;
            }

            if (point < 0 || point > 100) {
                continue;
            }

            if (point >= 50) {
                passingPoints.add(point);
            }

            points.add(point);

            if (point < 50) {
                grades[0] += "*";
            } else if (point < 60) {
                grades[1] += "*";
            } else if (point < 70) {
                grades[2] += "*";
            } else if (point < 80) {
                grades[3] += "*";
            } else if (point < 90) {
                grades[4] += "*";
            } else {
                grades[5] += "*";
            }
        }

        int total = 0;
        for (int point : points) {
            total += point;
        }

        int passingTotal = 0;
        for (int point : passingPoints) {
            passingTotal += point;
        }

        System.out.println("Point average (all): " + (1.0 * total / points.size()));
        System.out.println("Point average (passing): " + (passingTotal == 0 ? "-" : (1.0 * passingTotal / passingPoints.size())));
        System.out.println("Pass percentage: " + (100.0 * passingPoints.size() / points.size()));

        System.out.println("Grade distribution:");

        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + grades[i]);
        }
    }
}
