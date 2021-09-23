package TernaryOperator;

public class TernaryOperator {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        String result = a==b ? "Test" : "Java";
        System.out.println(result); // Java
        String result1 = a < b ? "Happy" : "Unhappy";
        System.out.println(result1); // Happy
        boolean result2 = a==b ? true : false;
        System.out.println(result2); // false
        char result3 = a!=b ? 'A' : 'B';
        System.out.println(result3); // A
        int result4 = b > a ? 45 : 54;
        System.out.println(result4); // 45
        double result5 = a>=b ? 2.5 : 5.2;
        System.out.println(result5); // 2.5
        System.out.println(a > b ? 3 : "zak"); // zak
        System.out.println(a < b ? 0.4 : 'b'); // 0.4
        int c = 6;
        System.out.println(c <= a ? c++ + a : b--); // 6
        System.out.println(c >= a ? c++ + a : b--); // 11
        System.out.println(c >= a ? c++ + c : b--); // 13
        System.out.println(c >= a ? ++c + c : b--); // 14

    }
}
