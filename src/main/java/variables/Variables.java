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
        


    }
}
