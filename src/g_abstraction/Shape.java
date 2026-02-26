package g_abstraction;

public abstract class Shape { //abstract parent class
    abstract double area(); //ABSTRACT METHOD THAT MUST BE IMPLEMENTED, IF CHILDREN INHERITS THIS CLASS
    void display() {
        System.out.println("This is a shape");
    }




}

