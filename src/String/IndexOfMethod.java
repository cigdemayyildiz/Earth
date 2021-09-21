package String;

public class IndexOfMethod {

    public static void main(String[] args) {

        // indexOf(); method --> this method will take a char and return the index number of that char

        java.lang.String device = "microphone";

        int num = device.indexOf('h');
        System.out.println(num); // 6

        int num1 = device.indexOf('i');
        System.out.println(num1); // 1

        int num3 = device.indexOf('o');
        System.out.println(num3); // 4

        int num4 = device.indexOf('o' , 5);
        System.out.println(num4); // 7

        int num5 = device.indexOf("rop");
        System.out.println(num5); // 3

        System.out.println(device.indexOf("microphone")); // 0

        System.out.println(device.indexOf("x")); // -1 (there is no 'x' in the string microphone)

        System.out.println(device.indexOf('M')); // -1 (there is no 'M' in the string microphone)

    }
}
