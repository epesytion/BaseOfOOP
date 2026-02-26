package g_abstraction;

public class Circle extends Shape { //since the abstract methods (area()) are inherited from "Shape" class,
                                    //it must be implemented
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    //since area() is abstract method, children must define it by their own implementation
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

}

