package k_wrapperClasses;

public class Main {
    public static void main(String[] args) {

        //Wrapper classes = Allow primitive values (s.a. int, char, double, boolean)
        //                  to be treated as objects.
        //                  Generally, don't wrap primitives unless you need an object.
        //                  It allows to use Collections Framework and static Utility Methods


        // int a = 123; we can treat this primitive as wrapper class

        Integer a = new Integer(123); //Here the wrapping. So, 'a' is an object, but it does contain primitive value
        //Again you shouldn't do it, but it's a good way to visualize
        Double b = new Double(3.14);
        Character c = new Character('$');
        Boolean d = new Boolean(true);
        //a, b, c, d are all objects
        //Integer, Double, Character, Boolean are reference datatypes as String

        //However  the modern way is to just assign a value to object directly (Autoboxing)
        Integer aa = 123;
        Double bb = 3.14;
        Character cc = '$';
        Boolean dd = true;

        // Unboxing
        int w = aa;
        double x = bb;
        char y = cc;
        boolean z = dd;


        System.out.println(z);

    }
}
