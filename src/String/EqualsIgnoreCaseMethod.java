package String;

public class EqualsIgnoreCaseMethod {

    public static void main(String[] args) {

        // equalsIgnoreCase();

        java.lang.String city = "New York";

        System.out.println(city.equalsIgnoreCase("New YOrk")); // true

        System.out.println("NEW york".equalsIgnoreCase(city)); // true

        "cigdem".equalsIgnoreCase("CIGDEM"); // true

        boolean name = "cigdem".equalsIgnoreCase("CIGDEM");
        System.out.println(name); // true


    }
}
