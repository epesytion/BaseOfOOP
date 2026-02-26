package g_abstraction;

public class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    //since area() is abstract method, children must define it by their own implementation
    @Override
    double area() {
        return 0.5 * base * height;
    }
}
