package PrimitiveDataTypes;

public class TruthTable {

    public static void main(String[] args) {

          /*
        Computer Class
        Exam1 + Exam2 + Exam3 --> average of the exams should be bigger than 60
        and class average should be less than my averageScore
         */

        int exam1 = 60;
        int exam2 = 53;
        int exam3 = 89;
        double classAverage = 59.7;

        double myAverage = (exam1+exam2+exam3)/3;

        boolean canPass = myAverage>60 && classAverage<myAverage; // myAverage>60--> true classAverage<myAverage--> false
        System.out.println("My average : " + myAverage); // 67.0
        System.out.println("Can I pass this class? " + canPass); // true


    }
}
