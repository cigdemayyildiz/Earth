package Object;

public class Animal {

    String name; // it is default if you add protect before String name --> access modifier
    int age; // you can make default or public or protect if you want to change its accessibility
    double weight;
    int legNumber;
    String color;
    double energy;

    public void run (String destination) {
        // public --> access modifier
        // void --> return type
        // run  --> name of the method
        // (String destination) --> parameter(s)
        // {} --> body creaters

        energy-=10;
        System.out.println(name+" is running to "+destination+".");

    }

    public void sleep () {
        energy=100;
        System.out.println(name+" is sleeping.");
    }

    // create 'printInfo() method to print out all information about the animal'

    public void printInfo () {

        System.out.println("Animal name is "+name);
        System.out.println("Animal age is "+age);
        System.out.println("Animal weight is "+weight);
        System.out.println("Animal leg number "+legNumber);
        System.out.println("Animal's energy is "+energy);
    }
}
