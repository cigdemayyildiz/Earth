package Methods;

public class AgeCalculatorTest {

    public static void main(String[] args) {

        AgeCalculator myAge = new AgeCalculator();
        myAge.ageCalculator(1983);

        int b = myAge.ageCalculator();


        if (b == 25){
            System.out.println("You must be happy");
        }


//        public String ageCalculator (String name, int birthYear){
//
//            int currentYear = 2021;
//            int age = currentYear-birthYear;
//            //System.out.println(name+" your age is: "+age);
//            return ""+name+" your age is "+age;

      // these above information is coming from AgeCalculator Class

        String x = myAge.ageCalculator("John", 1980);
        System.out.println(x);

    }
}
