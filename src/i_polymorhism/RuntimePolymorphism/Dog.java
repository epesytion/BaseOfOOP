package i_polymorhism.RuntimePolymorphism;

public class Dog  extends Animal{
    @Override
    void speak() {
        System.out.println("Dog goes *woof*");
    }
}
