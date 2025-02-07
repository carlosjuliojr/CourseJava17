package variables;

public class Variables {

    public static void main(String[] args) {
        /**
         * type of variables primitives
         * name : must start with letter or _
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


    }
}
