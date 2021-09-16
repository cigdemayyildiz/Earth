package PrimitiveDataTypes;

public class Practice6 {

    public static void main(String[] args) {

        /*
        Write a Java program to convert minutes into a number of years and days.
        Test DataInput the number of minutes: 3456789
        Expected Output :3456789 minutes is approximately 6 years and 210 days
         */

        int minutes = 3456789;
        int hours = minutes/60;
        int days = hours/24;
        int years = days/365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days%365 + " days.");
        // 3456789 minutes is approximately 6 years and 210 days.
    }
}
