package String;

public class CharAtMethod {

    public static void main(String[] args) {

        // charAt(); method --> it will return a char from specified index

        java.lang.String city = "Chicago";
        char firstLetter = city.charAt(0);
        System.out.println(firstLetter); // C

        // or

        System.out.println(city.charAt(4)); // a

        java.lang.String student = "Jennifer";
        System.out.println(student.charAt(7)); // r


        // show me the last char

        java.lang.String str = "he MAUD Committee was a British scientific working group formed during the " +
                "Second World War to determine if an atomic bomb was feasible. The name came from a reference " +
                "by Danish physicist Niels Bohr to his housekeeper, Maud Ray. The committee was founded in " +
                "response to the Frisch–Peierls memorandum, which argued that a small sphere of pure uranium-235" +
                "could have the explosive power of thousands of tons of TNT. Its chairman was George Thomson and" +
                " it met at Burlington House (pictured). Uranium enrichment, fissile materials, and the design" +
                " of nuclear reactors and nuclear weapons were examined. The research culminated in two reports," +
                " known collectively as the MAUD Report. In response, the British created a nuclear weapons project." +
                " The report was made available to the United States, where it energised the American effort, which" +
                " eventually became the Manhattan Project; it was also handed to the Soviet Union by its atomic spies," +
                " helping start the Soviet atomic bomb project. (Full article...)";
        System.out.println(str.charAt(str.length()-1));
        // or
        int numberLetters = str.length(); //
        System.out.println(numberLetters); // 999
        char lastLetter = str.charAt(numberLetters-1); //
        System.out.println(lastLetter); // )

    }
}
