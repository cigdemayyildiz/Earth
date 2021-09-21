package String;

public class Equals {

    public static void main(String[] args) {

        // equals(); returns a boolean results as true or false

        java.lang.String city = "New York";

        System.out.println(city.equals("New")); // false
        System.out.println(city.equals("York")); // false
        System.out.println(city.equals("New York")); // true
        System.out.println(city.equals(" ")); // false

        city.toLowerCase();
        System.out.println(city.equals("New York")); // true

        city.toUpperCase();
        System.out.println(city.equals("New York")); // true

        java.lang.String city1 = city.toLowerCase().concat(" is too crowded!"); // new york is too crowded!
        System.out.println(city1);
        System.out.println(city1.contains(city)); // false
        System.out.println(city1.equals("new york is too crowded!")); // true

        java.lang.String city2 = city.toUpperCase().concat(" is very beautiful!"); // NEW YORK is very beautiful!
        System.out.println(city2);
        System.out.println(city2.contains(city1)); // false
        System.out.println(city2.equals("NEW YORK is very beautiful!")); // true

    }
}
