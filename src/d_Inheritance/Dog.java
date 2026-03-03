package d_Inheritance;
//3.
public class Dog extends Animal {
    Dog(boolean isAlive) { //Constructor of Animal in constructor of Dog
        super(isAlive);
    } //inheritance is achieved by "extend" keyword
    //5. Let's write additional method for dog. The action, that only dog does.
    void guard(){
        System.out.println("The DOG is guarding ");
    }


}
