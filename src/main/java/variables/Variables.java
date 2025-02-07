package variables;

public class Variables {

    public static void main(String[] args) {
        /**
         * type of variables primitives
         * name : must start with letter or _
         * if you declare an variable and you want print it you need before initialize it
         * name of variable must not start with number or special characters
         * name of variable should not be a reserve world of the language
         
         */

        int number = 0;
        char letter = 'j';

        System.out.println("value integer is: " + number);
        System.out.println("letter = " + letter);

        /**
         * type of variables reference
         */

        String name = "julio";
        Integer age = Integer.valueOf(5);

        System.out.println("name = " + name.toUpperCase());
        System.out.println("age = " + age);

        /**
         * this is used to assign type format dinamic
         */
        var variable = "this is an string";
        System.out.println("variable = " + variable);

        /**
         * type of primitives
         * byte : -128 - 127 : 8 bits
         * short : -32768 to 32767 : 16 bits
         * int : -2147483648 to 2147483647 : 32 bits
         * long : -9223372036854775808 to 9223372036854775807 : 64 bits
         * float : 32 bits
         * double : 64 bits
         */

        byte numberByte = 127;
        short numberShort = -32768;
        int numberInt = -2147483648;
        long numberLong = 9223372036854775807L;
        double numberDouble = 4.40e3;
        float numberFloat = 342141234f;

        System.out.println("\n***** number of Byte*******\n");
        System.out.println("numberByte = " + numberByte);
        System.out.println("byte of numberByte = " + Byte.BYTES);
        System.out.println("bites of numberByte = " + Byte.SIZE);
        System.out.println("max numberByte = " + Byte.MAX_VALUE);
        System.out.println("min numberByte = " + Byte.MIN_VALUE);

        System.out.println("\n***** number of short*******\n");
        System.out.println("numberShort = " + numberShort);
        System.out.println("byte of numbersShort = " + Short.BYTES);
        System.out.println("bites of numbersShort = " + Short.SIZE);
        System.out.println("max numbersShort = " + Short.MAX_VALUE);
        System.out.println("min numbersShort = " + Short.MIN_VALUE);

        System.out.println("\n***** number of int*******\n");
        System.out.println("numberInt = " + numberInt);
        System.out.println("byte of numbersInt = " + Integer.BYTES);
        System.out.println("bites of numbersInt = " + Integer.SIZE);
        System.out.println("max numbersInt = " + Integer.MAX_VALUE);
        System.out.println("min numbersInt = " + Integer.MIN_VALUE);

        System.out.println("\n***** number of long*******\n");
        System.out.println("numberLong = " + numberLong);
        System.out.println("byte of numbersLong = " + Long.BYTES);
        System.out.println("bites of numbersLong = " + Long.SIZE);
        System.out.println("max numbersLong = " + Long.MAX_VALUE);
        System.out.println("min numbersLong = " + Long.MIN_VALUE);

        System.out.println("\n***** number of double*******\n");
        System.out.println("numberDouble = " + numberDouble);
        System.out.println("byte of numbersDouble = " + Double.BYTES);
        System.out.println("bites of numbersDouble = " + Double.SIZE);
        System.out.println("max numbersDouble = " + Double.MAX_VALUE);
        System.out.println("min numbersDouble = " + Double.MIN_VALUE);

        System.out.println("\n***** number of float*******\n");
        System.out.println("numberFloat = " + numberFloat);
        System.out.println("byte of numbersFloat = " + Float.BYTES);
        System.out.println("bites of numbersFloat = " + Float.SIZE);
        System.out.println("max numbersFloat = " + Float.MAX_VALUE);
        System.out.println("min numbersFloat = " + Float.MIN_VALUE);





    }
}
