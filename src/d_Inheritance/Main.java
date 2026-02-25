package d_Inheritance;

public class Main {
    static void main(String[] args) {
        //1.
        //inheritance is when the one class inherits the attributes and methods from another class (go to Animal class)
        //Child <- Parent <- GrandParent
        //4.
        Dog dog = new Dog();
        System.out.println(dog.isAlive); //We can output the variable. And because in "Dog" class we inherited "Animal",
        //the new instances of "Dog" class have the same variables
        dog.eat();

        //5.You can also create specific methods for each child (go to Dog.java)
        //6.
        dog.guard();

        //7.
        //we can also add a grandparent (so the parent for "Animal" class in our case)
        //Lets make another package for this case, with the same classes +"Organism" class
        //(GO TO Grandparent.Organism)
    }
}
