package Students;

public class DataTypes {
    public static void main(String[] args) {

        boolean flag = true;
        System.out.println(flag);
        int myNum = 9;
        System.out.println(myNum);
        float myFloatNum = 8.99f;
        System.out.println(myFloatNum);
        char myLetter = 'A';
        System.out.println(myLetter);
        boolean myBool = false;
        System.out.println(myBool);
        String myText = "Hello World";
        System.out.println(myText);
    }
}

/*
Widening − Converting a lower datatype to a higher datatype is known as widening.
In this case the casting/conversion is done automatically therefore,
it is known as implicit type casting. In this case both datatypes should be compatible with each other.

byte -> short -> int -> long -> float -> double
 */

/*
Narrowing − Converting a higher datatype to a lower datatype is known as narrowing.
In this case the casting/conversion is not done automatically, you need to convert
explicitly using the cast operator “( )” explicitly. Therefore,
it is known as explicit type casting. In this case both datatypes need not be compatible with each other.

double -> float -> long -> int -> short -> byte
 */