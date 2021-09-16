package String;

public class String {

    public static void main(java.lang.String[] args) {

        java.lang.String name = "Techtorial"; // first way of creating String. You should use " ".

        java.lang.String lastName = new java.lang.String("Academy"); // second way of creating String

        System.out.println(name);
        System.out.println(lastName);

        System.out.println(name + lastName); // TechtorialAcademy

        System.out.println(name + 10);
        System.out.println(name + 10 + 8);
        System.out.println(name + (10 + 8));
        System.out.println(10 + 8 + name);
        System.out.println(name + 10 * 8);
        System.out.println(name + (10 - 8)); 

        java.lang.String age = " 20";
        int num = 5;

        System.out.println(num+age);

        java.lang.String number = "1";
        number += "2";
        number += 2;
        System.out.println(number);

    }
}
