package PrimitiveDataTypes;

public class Boolean {

    public static void main(String[] args) {


        // true or false
        boolean isLightOn = false; // it means lights are off
        System.out.println(isLightOn);

        System.out.println("Lights are " + true);
        System.out.println("Lights are " + true);
        System.out.println("Lights are " + true);
        System.out.println("Lights are " + true);

        System.out.println("Lights are " + isLightOn);
        System.out.println("Lights are " + isLightOn);
        System.out.println("Lights are " + isLightOn);
        System.out.println("Lights are " + isLightOn); // we do not need to write same thins several times
        System.out.println("Lights are " + isLightOn); // we should use boolean to write same things several times

        isLightOn = false;
        System.out.println("Lights are " + isLightOn);

        isLightOn = !false; // exclamation mark makes the case opposite (it means it is not equal)
        System.out.println(isLightOn);

        boolean isBreakTimeYet = true;
        System.out.println(isBreakTimeYet);

    }
}
