package h_interfaces;

public class Main {
    //Interfaces = A blueprint for a class that specifies a set of abstract methods
    //             that MUST be defined by classes that implement the interface
    //             Supports multiple inheritance-like behavior (child can inherit multiple classes)

    //start by Interfaces, and then Rabbit and Hawk classes
    static void main(String[] args) {
        Rabbit r = new Rabbit();
        Hawk h = new Hawk();
        r.flee();
        h.hunt();
        //'till this line, everything is clear. It's basic method inheritance and overriding.
        //But now, lets consider that the Fish can be both Prey and Predator
        // (can eat smaller fish and swim from sharks e.g.)
        //Go to fish class

        Fish f = new Fish(); //since we can have more than one parent in case of interfaces,
        //we can use both methods that implemented from 2 different interfaces in Fish class
        f.flee();
        f.hunt();
    }
}

