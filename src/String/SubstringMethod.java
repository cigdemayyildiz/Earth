package String;

public class SubstringMethod {

    public static void main(String[] args) {

        // subString(); return (giving back) String (partial String)

        java.lang.String string = "computer";

        java.lang.String substring1 = string.substring(5); // it will return 'ter' index number a gore sayiyor ve kelimenin senin verdigin numaradan sonrasini aliyor

        System.out.println(substring1);

        java.lang.String part = string.substring(0, 2); // sifir index numarasindan basliyor kelimenin 2 index numarasina kadar olan kismini aliyor, 2 yi almiyor.
        System.out.println(part); // co

        java.lang.String email = "    Techtorial@gmail.com    "; // zak@gmail.com     abcd@gmail.com

        java.lang.String part1 = email.substring(email.indexOf("@"));
        System.out.println(part1);

        // method chaining --> bir satirda birden fazla metodu calistirma, eger istenen sonuc sayi olacaksa primitive data type kullaniyoruz ve sayi ile ilgili olan komutu en sona yaziyoruz cunku istenen sonuc o olacak.

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
