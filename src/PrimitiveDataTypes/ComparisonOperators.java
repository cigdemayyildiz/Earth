package PrimitiveDataTypes;

public class ComparisonOperators {

    public static void main(String[] args) {

        boolean isLightOn = true;

        System.out.println(!isLightOn); // it will applied only to this line
        System.out.println(isLightOn); // the original value won't change

        // comparison operators returns boolean result
        System.out.println(40==40); // if left value is equal to right value --> true
        System.out.println(40>39); // 40 is bigger than 30 --> true
        System.out.println(20<33); // 20 is less than 33 --> true
        System.out.println('c'=='C'); // c is equal to C --> false
        System.out.println('c'>'C'); // c is bigger than C according to ASCII --> true
        System.out.println(true!=false); // true is not equals to false --> true

        char c = 'c';
        c++;
        System.out.println(c); // d

    }
}
