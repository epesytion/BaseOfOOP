package b_ArrayOfObj;

public class Car {
    String model;
    String color;

    //Constructor
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void drive(){
        System.out.println("Driving" + this.model + " " + this.color);
    }
}
