package Scanner;

public class Scanner {

    public static void main(String[] args) {

        String name = "David";

        java.util.Scanner input = new java.util.Scanner(System.in); // created object of a Scanner
        System.out.println("Please enter your name: "); // Cigdem
        name = input.nextLine();

        System.out.println("Your name is: " + name); // Cigdem

        // Ask user to provide his/her last name and store it as lastName output should be: Alex Souza
        // and then print it out as their full name
        // EX: name: Alex  lastName: Souza

        String name1 = "";
        String lastName = "";

        java.util.Scanner input1 = new java.util.Scanner(System.in);

        System.out.println("Please enter your name: "); // Please enter your name
        name = input.nextLine(); // Cigdem
        System.out.println("Your name is: " + name1); // Your name is: Cigdem
        System.out.println("Please enter your last name: "); // Please enter your last name:
        lastName = input.nextLine(); // Ayyildiz
        System.out.println("Your last name is: " + lastName); // Your last name is: Ayyildiz

        System.out.println("Your full name is: " + name1 + " " + lastName); // Your full name is: Cigdem Ayyildiz

        // input.nextLine(); --> It reads entire text
        // input.next(); --> It reads single word, you can entire only one word, you even enter space you cannot see it

        System.out.println("Please enter your city "); // Texas
        String city = input.next();
        System.out.println("You live in " + city); // Texas
        System.out.println("Please provide your address");
        input = new java.util.Scanner(System.in);
        String address = input.nextLine();
        System.out.println(address);


    }
}
