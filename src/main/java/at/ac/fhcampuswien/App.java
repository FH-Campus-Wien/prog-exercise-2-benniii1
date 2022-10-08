package at.ac.fhcampuswien;

import java.io.Console;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        double largestNumber = 0;
        double d;
        do {
            System.out.print(String.format("Number %d: ", i));
            d = scanner.nextDouble();

            if (i == 1 && d <= 0) {
                System.out.println("No number entered.");
                return;
            }

            if (largestNumber < d) {
                largestNumber = d;
            }

            i++;
        } while (d > 0);

        System.out.println(String.format("%s %.2f", "The largest number is", largestNumber));
    }

    //todo Task 2
    public void stairs() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int stairs = scanner.nextInt();

        if (stairs <= 0) {
            System.out.println("Invalid number!");
            return;
        }

        int n = 1;
        for (int i = stairs; i > 0; i--) {
            for (int j = 0; j < stairs - i + 1; j++) {
                System.out.printf("%d ", n);
                n++;
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid() {
        final int ROWS = 6;

        int addStars;
        for (int i = ROWS; i > 0; i--) {
            addStars = (ROWS - i) * 2;

            for (int k = ROWS; k > addStars / 2 + 1; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < addStars; j++) {
                System.out.print("*");
            }

            System.out.println("*");
        }
    }

    //todo Task 4
    public void printRhombus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
        int h = scanner.nextInt();

        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 == 0) {
            System.out.println("Invalid number!");
            return;
        }

        for (int i = 0; i < h / 2; i++) {
            for (int k = h - i; k > h / 2 + 1; k--) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print((char) (c - j));
            }

            System.out.print(c);

            for (int j = 1; j < i + 1; j++) {
                System.out.print((char) (c - j));
            }

            System.out.println();
        }

        for (int i = h / 2; i >= 0; i--) {
            for (int k = h - i; k > h / 2 + 1; k--) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print((char) (c - j));
            }

            System.out.print(c);

            for (int j = 1; j < i + 1; j++) {
                System.out.print((char) (c - j));
            }

            System.out.println();
        }
    }

    //todo Task 5
    public void marks() {
        Scanner scanner = new Scanner(System.in);

        int mark;
        int sumMarks = 0;
        int countMarks = 1;
        int countFive = 0;
        while (true) {
            System.out.printf("Mark %d: ", countMarks);
            mark = scanner.nextInt();

            if (mark == 0) break;

            if (mark < 0 || mark > 5) {
                System.out.println("Invalid mark!");
                continue;
            }

            if (mark == 5) countFive++;
            sumMarks += mark;
            countMarks++;
        }

        countMarks -= 1;
        float average = countMarks != 0 ? (float)sumMarks/countMarks : 0;

        System.out.println(String.format("%s %.2f", "Average:", average));
        System.out.println(String.format("%s %d", "Negative marks:", countFive));
    }

    //todo Task 6
    public void happyNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int number = scanner.nextInt();

        int result = 0;
        int cycle = 0;
        while (true){
            while (number != 0){
                result += (number % 10) * (number % 10);
                number = number / 10;
            }

            if (result == 1){
                System.out.println("Happy number!");
                return;
            }

            if (result == 4){
                if (cycle > 1){
                    System.out.println("Sad number!");
                    return;
                }

                cycle++;
            }

            number = result;
            result = 0;
        }
    }

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}