package Loops;

public class ForLoop2 {

    public static void main(String[] args) {


        for (int number = 1; number<=5 ;number++ ){ // int number = 1; --> local variable. it cannot effect other variables.
            System.out.println("It is for LOOP " + number);
        }

        int number = 1; // global variable
        for (; number<=5 ;number++ ){
            System.out.println("It is second for LOOP " + number);
        }

        int numbers;
        for (numbers = 1; numbers<=5 ;numbers++ ){
            System.out.println("It is third for LOOP " + numbers);
        }
    }
}
