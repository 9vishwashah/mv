package TestPackage;

public class MathOperators {

    public static void main(String[] args) {
        double x = 22;
        double y = 4;

        // return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        //returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        // return a power of 2
        System.out.println("exp of a is: " +Math.exp(x));

        //returns a random value
        System.out.println(Math.random());

        /*
        The Math. random() Java method generates a pseudorandom number between 0.0 and 1.0.
        The resulting random number can be multiplied to get a range outside 0-1,
        and the result can be 0 but is always less than 1.
         */

        //return the absolute (positive) value of the number
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.abs(4.7));

        // float numbers
        float xyz = 4567.9874f;

        // find the closest int for these floats
        System.out.println(Math.round(xyz));

        float yzx = -3421.134f;

        // find the closest int for these floats
        System.out.println(Math.round(yzx));

    }


    }
