package g_abstraction;

public class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //since area() is abstract method, children must define it by their own implementation
    @Override
    double area() {
        return width * height;
    }


}
