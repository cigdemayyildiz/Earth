package Array;

public class Reverse {

    public static void main(String[] args) {

        java.lang.String[] colors = {"Red", "Blue", "Green", "Yellow", "Brown", "Orange", "White", "Purple", "Gray", "Pink", "Violet", "Black"};

        // print out every element in reverse version

        for (java.lang.String color: colors){
            java.lang.String reverse = "";
            for (int i=color.length()-1; i>=0; i--){
                reverse+=color.charAt(i);
            }
            System.out.print(reverse+", ");
        }

    }
}
