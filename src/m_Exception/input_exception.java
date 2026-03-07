package m_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class input_exception {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        //Because we created the 'int' variable, we cant pass other datatypes like String, boolean etc.
        //We can handle this exception
        System.out.println("Your num: " + num);
*/

        try{
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("Your num: " + num);
        }
        catch(InputMismatchException e){ //Actually we need to import the InputMismatchException
            System.out.println("You must pass an integer");
        }
    //So, if we pass integer, it prints out number, if not -> it prints "You must pass an integer"

        //We also have optional 'finally' block
        finally{ //this block always executes
            sc.close(); //it's good for cleaning up the program, when you're done with it
            System.out.println("*End of program*");
        }
        //We can also use resources in 'try'

    }
}
