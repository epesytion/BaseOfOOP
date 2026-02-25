package d_Inheritance.Granparent;

public class Main {
    static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        //9.
        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesize();
    }
}
//the family tree:
//            Organism
//          /          \
//       Plant        Animal
//                   /      \
//                 Dog      Cat