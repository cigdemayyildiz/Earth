package String;

public class ToLowerCaseMethod {

    public static void main(String[] args) {

        // toLowerCase();

        java.lang.String str = "Do what ever it takes ";
        java.lang.String quote = "JUst dO iT";

        System.out.println(str.toLowerCase());
        System.out.println(str);
        System.out.println(quote.toUpperCase());
        System.out.println(quote);
        quote = quote.toUpperCase(); // tum harfleri buyuk harf yap metodu
        System.out.println(quote.indexOf('D')); // bir ust satirda tum harfler buyuk harf yapildigi icin bu metod calisiyor, eger tum harfleri buyuk yapmasaydik sonuc -1 olacakti

        java.lang.String result = str.concat(quote);
        System.out.println(result);
        result = result.toUpperCase();
        System.out.println(result);

    }
}
