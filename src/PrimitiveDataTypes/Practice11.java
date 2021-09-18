package PrimitiveDataTypes;

public class Practice11 {

    public static void main(String[] args) {

        /*
        Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5 Expected Output
        Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
         */

        float width = 5.6f;
        float height = 8.5f;

        System.out.println("Area is " + width + " * " + height + " = " + (width*height));
        // Area is 5.6 * 8.5 = 47.6
        System.out.println("Perimeter is 2*(5.6+8.5) = " + 2*(width+height));
        // Perimeter is 2*(5.6+8.5) = 28.2

    }
}
