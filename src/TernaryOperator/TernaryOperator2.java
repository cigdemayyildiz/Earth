package TernaryOperator;

public class TernaryOperator2 {

    public static void main(String[] args) {

        String str = "Techtorial";

        String result = str.contains("tech") ? str.concat(" Academy") : str.replace("Tech", "TECH");

        System.out.println(result); // TECHtorial

        System.out.println('A' == 'A' ? 5 : "testing char"); // 5

        int x = 1;
        int y = 3;
        y++; // 3 will be 4 at the next y
        x*=y;
        System.out.println(result.equals("Techtorial") ? x++ : y++); // 4

    }
}
