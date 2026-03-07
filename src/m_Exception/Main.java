package m_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Exception = An event that interrupts the normal flow of a program
    //             (Dividing by zero, file not found, mismatch input type)


    static void main(String[] args) {

//        System.out.println(11/0);  //ArithmeticException
        //to Handle it, we ues try-catch syntax
        try{
            System.out.println(1 / 0);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero"); //Any code that contains error can be handled by catching this error
        }


        //Lets look at input exception (go to the antother class

    }
}
