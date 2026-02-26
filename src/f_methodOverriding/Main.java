package f_methodOverriding;

public class Main {
    static void main(String[] args) {
        //Method overriding = when a subclass provides its own implementation
        //of a method that is already defined by parent class.
        //It's a good practice to write @Override keyword.
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        animal.move();
        dog.move();
        cat.move();
        fish.move();

    }
}

