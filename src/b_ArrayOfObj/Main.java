package b_ArrayOfObj;

public class Main {
    static void main(String[] args) {
        //1. Start by "Car" class

        //2. Creating 'car' objects
        Car car1 = new Car("Nissan", "Silver");
        Car car2 = new Car("Mercedes", "Brown");
        Car car3 = new Car("Shevrolet", "White");

        //3. Array of objects - as usual array, but the datatype is the class.
        //Bcs, in java the classes are also datatype;

        //regular array:
        int[] nums = {1, 2, 3};

        //Array of objects;
        Car[] cars= {car1, car2, car3};

        //Using loop to output the driving each car;
        for(Car c : cars){
            c.drive();
        }
    }
}












