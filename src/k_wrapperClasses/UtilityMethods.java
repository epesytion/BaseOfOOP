package k_wrapperClasses;

public class UtilityMethods {
    static void main(String[] args) {
        //We can use some cool methods to wrapper classes.


        char letter = 'b';
        char notLetter = '$';
        System.out.println(Character.isLetter(letter)); //checks, if the character is letter
        System.out.println(Character.isLetter(notLetter));

        System.out.println(Character.isUpperCase(letter)); //checks, if the character in upper case

        int num = 5;
        int num2 = 499;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.sum(num, num2));
    }
}
