package m_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class resources {

    //just copy input_exception
    static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) { //rather than declaring scanner outside the try block,
                //we can declare it in brackets
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("Your num: " + num);
        }
        catch(InputMismatchException e){
            System.out.println("You must pass an integer");
        }

        finally{
        //    sc.close();  //And, we dont need to close the resources (scanner in our case), bcs it closes automatically
            System.out.println("*End of program*");
        }
    }
}
