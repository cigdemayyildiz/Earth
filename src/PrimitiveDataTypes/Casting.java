package PrimitiveDataTypes;

public class Casting {

    public static void main(String[] args) {

        byte by = 10;
        short sh = by; // java makes casting automatically, you don't need to put (short) before by
        System.out.println(sh);

        long ln = 150;
        int num = (int)ln; // which data type you want to cast you should put that's name
        // you cannot use long in this case, because you need to cast bigger number to the smaller number
        System.out.println(num);

        byte b = 55; // 10 + 10 + 10 + 10 + 10 + 5 --> 5 is remainder
        short s = 10;
        short result = (short)(b%s); // you should use parentheses for the calculation (first calculation next casting)
        System.out.println(result);

        double db = 4.8;
        long l = (long)db;
        System.out.println(l);

        int num1 = 15;
        long num2 = 100;
        num1 = (int)(num1+num2);
        System.out.println(num1); // num1 = 115

        num1+=num2; // 215
        System.out.println(num1);

    }
}
