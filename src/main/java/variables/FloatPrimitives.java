package variables;

public class FloatPrimitives {

    public static void main(String[] args) {


        float numberFloat = 1.23f;
        System.out.println("\n***** number of Float*******\n");
        System.out.println("numberByte = " + numberFloat);
        System.out.println("byte of numberFloat = " + Float.BYTES);
        System.out.println("bites of numberFloat = " + Float.SIZE);
        System.out.println("max numberFloat = " + Float.MAX_VALUE);
        System.out.println("min numberFloat = " + Float.MIN_VALUE);

        double doubleNumber = 2.3e3;
        System.out.println("\n***** number of double*******\n");
        System.out.println("numberShort = " + doubleNumber);
        System.out.println("byte of numbersDouble = " + Double.BYTES);
        System.out.println("bites of numbersDouble = " + Double.SIZE);
        System.out.println("max numbersDouble = " + Double.MAX_VALUE);
        System.out.println("min numbersDouble = " + Double.MIN_VALUE);
    }
}
