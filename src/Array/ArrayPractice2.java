package Array;

public class ArrayPractice2 {

    public static void main(String[] args) {

        // create an array to store these numbers: 45, 5, 6, 47, 57, 8, 12, 30

        int [] numbers = {45, 5, 6, 47, 57, 8, 12,30};

        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>10){
                System.out.println(numbers[i]);
            }
        }
    }
}
