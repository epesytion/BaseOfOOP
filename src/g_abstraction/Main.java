package g_abstraction;

public class Main {
    static void main(String[] args) {
        //abstract = used to define abstract classes and methods
        //  Abstraction is the process of hiding implementation details
        //  and showing only the essential details
        //  Abstract classes CAN'T be initialized directly
        //  Can contain 'abstract' methods (which must be implemented)
        //  Can contain 'concrete' methods (which are inherited and may or may not be implemented (as you wish))

        /*
        Shape shape = new Shape(); //Since "Shape" is abstract, we cant create exact instance of shape
        */

        //But we can create instances of classes that are child of abstract class "Shape"
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());


    }
}
