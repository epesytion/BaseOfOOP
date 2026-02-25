package d_Inheritance;

import d_Inheritance.Granparent.Organism;

public class Animal{
    //2.
    // Let's specify animal's behaviour
    boolean isAlive;
    Animal() { //constructor to assign the isAlive variable
        isAlive= true; //see the 7th line in 'Main' class to understand why can we write like this for variables (isAlive)
    }
    void eat(){
        System.out.println("The animal is eating");
    }
    //Go to Dog.java
}
