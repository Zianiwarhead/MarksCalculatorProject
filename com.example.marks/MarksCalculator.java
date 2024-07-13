

import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        MarksCalculator calculator = new MarksCalculator();
        calculator.enterMarksAndComputeAverage();
    }

    public void enterMarksAndComputeAverage() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        double average = (javaMarks + networkingMarks + mathsMarks) / 3;

        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + average);
        
        scanner.close();
    }
}
