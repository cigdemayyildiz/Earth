package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {

        java.util.ArrayList<String> colors = new ArrayList<>(5);

        colors.add("white");
        colors.add("black");
        colors.add("pink");
        colors.add("yellow");
        colors.add("blue");

        System.out.println(colors); // [white, black, pink, yellow, blue]

        System.out.println();

        for (int i = 0; i < colors.size(); i++) {
            System.out.println("This is from for loop --> "+colors.get(i));
        }

        System.out.println();

        for (String color:colors) {
            System.out.println("This is from for each loop --> "+color);
        }

    }
}
