package Switch;

import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favorite fruit");

        switch (input.nextLine().toLowerCase()){
            case "strawberry":
                System.out.println("We have your favorite fruit.");
                break;
            case "apple":
                System.out.println("We have your favorite fruit.");
                break;
            case "dragon Fruit":
                System.out.println("We have your favorite fruit.");
                break;
            case "kiwi":
                System.out.println("We have your favorite fruit.");
                break;
            case "banana":
                System.out.println("We have your favorite fruit.");
                break;
            default:
                System.out.println("Sorry! We don't have your favorite fruit.");
        }

        /* boolean bl = true;
        switch (bl){
            case true:
                System.out.println("what");
                break;
            case false:
                System.out.println("ne");
                break;

        **** SWITCH DOES NOT SUPPORT BOOLEAN DATA TYPE ****

         */
    }

    }
}
