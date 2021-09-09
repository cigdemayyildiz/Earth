package Loops;

public class NestedForLoop1 {

    public static void main(String[] args) {

        for (int year=2020;year<=2023;year++){
            System.out.print(year);
            for (int months=1;months<=12;months++){
                System.out.print(" --> " + months);
            }
            System.out.println();
        }

    }
}
