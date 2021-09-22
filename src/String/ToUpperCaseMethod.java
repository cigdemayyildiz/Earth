package String;

public class ToUpperCaseMethod {

    public static void main(String[] args) {

        // toUpperCase();

        java.lang.String str = "Do what ever it takes ";
        java.lang.String quote = "JUst dO iT";

        System.out.println(str.toLowerCase());
        System.out.println(str);
        System.out.println(quote.toUpperCase());
        System.out.println(quote);
        quote = quote.toUpperCase();
        System.out.println(quote.indexOf('D'));

        java.lang.String result = str.concat(quote);
        System.out.println(result);
        result = result.toUpperCase();
        System.out.println(result);

    }
}
