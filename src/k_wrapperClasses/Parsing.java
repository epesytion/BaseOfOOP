package k_wrapperClasses;

public class Parsing {
    //The process of converting string to different datatypes (the reversed String conversion)
    String w = "123";
    int a = Integer.parseInt(w);

    String x = "4.546";
    double b = Double.parseDouble(x);

    //Character doesn't have parse method
    String y = "+++";
    char c = y.charAt(0); //the number in brackets = index in string

    String z = "false";
    boolean d = Boolean.parseBoolean(z);
}
