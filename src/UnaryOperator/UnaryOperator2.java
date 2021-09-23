package UnaryOperator;

public class UnaryOperator2 {

    public static void main(String[] args) {

        int flower = 8;
        int result = flower++ + ++flower; // 8+1+9
        System.out.println(result);

        int burger = 5;
        int total = burger-- + 5 - --burger + burger/2; // 5 + 5 - 3 + 3/2 = 5 + 5 - 3 + 1
        System.out.println(total);

        int k = 8;
        int _result = 5 * k++ - k-- / k++ % --k; // 5 * 8 - 9 / 8 % 8; --> 40 - 1 = 39;
        System.out.println(_result);

        int n = 5;
        int r = 8;
        int _total = n++ % 5 * ++r  / n-- + ++n / r--;
        // 5 % 5 * 9 / 6 + 6 / 9
        // 0 * 9 / 6 + 6 / 9
        // 0 * 6 + 6 / 9
        // 0 + 6 / 9
        // 0 + 0;
        System.out.println(_total);

    }
}
