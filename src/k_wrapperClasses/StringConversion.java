package k_wrapperClasses;

public class StringConversion {
    public static void main(String[] args) {
        //We can convert different datatypes to a string using the integer wrapper class
        int x = 555;
        String a = Integer.toString(x);

        Double y = new Double(4.56);
        String b = Double.toString(y);
//
//        Character z = '#'; //Modern wrapping
//        String c = Character.toString(z);
//
//        System.out.println(a+b+c);
    }
}
