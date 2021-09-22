package String;

public class MethodChaining {

    public static void main(String[] args) {

        java.lang.String email = "    Techtorial@gmail.com    ";
        java.lang.String part1 = email.substring(email.indexOf("@"));
        System.out.println(part1);

        int indexOfSlash = part1.toUpperCase().concat("/tech").indexOf('/');
        System.out.println(indexOfSlash);

        int length = email.replace("gmail.com", "yahoo.com").toUpperCase().substring(0, email.indexOf('@')).trim().length();
        System.out.println(length);

        /*
        Task
        String str = " Zero to Hero   ";
        - change Zero with One
        - make all of them uppercase
        - remove all spaces
        - get only first three letters
        - print the length of those three letters
         */

        java.lang.String str = "  Zero to Hero   ";

        int result = str.replace("Zero", "Hero").toUpperCase().trim().substring(0,3).length();
        System.out.println(result);

    }
}
