package UnaryOperators;

public class UnaryOperator {

    public static void main(String[] args) {


        int number = 11;

        number++; // post increment
        System.out.println(number++); // 12 post increment will be applied after this line
        System.out.println(number); // 13
        System.out.println(++number); // 14 thanks to pre increment
        System.out.println(number--); // 14 thanks to post decrement
        System.out.println(--number); // 12 thanks to pre decrement

        int num = 4;
        int result = num++ + num; // num++ --> 4 plus 5
        System.out.println(result);

        int nm = 4;
        int rs = ++nm + nm; // ++nm --> 5 plus 5 (pre increment changed the nm`s value
        System.out.println(rs);

    }
}
