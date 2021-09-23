package Scanner;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {

        // BMI Calculation

        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight"); // 165
        double weight = scanner.nextDouble();

        System.out.println("Please enter your height"); // 50
        double height = scanner.nextDouble();

        double bmi = weight / (height*height);
        System.out.println("Your BMI is: " + bmi); // 18.36

    }
}
