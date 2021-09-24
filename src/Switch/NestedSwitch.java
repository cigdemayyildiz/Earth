package Switch;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose department from following options: \n 1- IT Dept. \n 2- HR Dept.\n 3- Customer Care \n 4- Admin"  );
        int department = input.nextInt();

        switch (department){
            case 1:
                System.out.println("Who do you want to speak with? \n 1- Alex \n 2- David \n 3- John");
                int name = input.nextInt();
                switch (name){
                    case 1:
                        System.out.println("You're speaking with Alex.");
                        break;
                    case 2:
                        System.out.println("You're speaking with David.");
                        break;
                    case 3:
                        System.out.println("You're speaking with John.");
                        break;
                    default:
                        System.out.println("Please choose the correct name.");
                        break;
                }
                break;
            case 2:
                System.out.println("Who do you want to speak with? \n 1- Serra \n 2- Jessica");
                int name1 = input.nextInt();
                switch (name1){
                    case 1:
                        System.out.println("You're speaking with Serra.");
                        break;
                    case 2:
                        System.out.println("You're speaking with Jessica.");
                        break;
                    default:
                        System.out.println("Please choose the correct name.");
                }
                break;
            case 3:
                System.out.println("Who do you want to speak with? \n 1- Michael \n 2- Marry \n 3- Norma");
                int name3 = input.nextInt();
                switch (name3){
                    case 1:
                        System.out.println("You're speaking with Michael.");
                        break;
                    case 2:
                        System.out.println("You're speaking with Marry.");
                        break;
                    case 3:
                        System.out.println("You're speaking with Norma.");
                        break;
                    default:
                        System.out.println("Please choose the correct name.");
                }
                break;
            case 4:
                System.out.println("Please hold on the line, you'll be speak with Kathy.");
                break;
            default:
                System.out.println("Please choose the correct department.");
        }
    }
}
