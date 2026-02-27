package i_polymorhism.RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //Dynamic polymorphism = when the method that gets executed is decided
        //                       at runtime based on the actual type of the object.

        //1.
        //Create  class "Animal"

        //3.Since Animal is abstract class, we cannot create any Animal object
        //Animal animal = new Animal()  ->  error

        //Let's just declare animal object, but not define
        Animal animal;
        //We will read users input to declare what kind of animal we need to define by Animal class.
    /*
    It's like: Animal animal = new Dog()  or  Animal animal = new Cat()
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pet (1 = dog, 2 = cat): ");
        int choice = sc.nextInt();
        if (choice == 1) {
            animal = new Dog();
            System.out.print("Your pet is dog and ");
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            System.out.print("Your pet is cat and ");
            animal.speak();
        }
        else  {
            System.out.println("Invalid choice");
        }
    }
}
















