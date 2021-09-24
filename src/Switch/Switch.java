package Switch;

public class Switch {

    public static void main(String[] args) {

    int number = 1;

        switch (number) {
            default:
                System.out.println("Invalid entry"); // if you enter except 1, 2, 3, 4, 5 --> you'll see this message.
                break;
            case 1:
                System.out.println("This is IT Department"); // if you enter 1 --> you'll see this message
                break;
            case 2:
                System.out.println("This is HR Department"); // if you enter 2 --> you'll see this message
                break;
            case 3:
                System.out.println("This is Admin"); // if you enter 3 --> you'll see this message
                break;
            case 4:
                System.out.println("This is Customer Care"); // if you enter 4 --> you'll see this message
                break;
            case 5:
                System.out.println("This is Finance Department"); // if you enter 5 --> you'll see this message
                break;

        }

    }

}
