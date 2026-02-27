package j_relationships.composition;

public class Main {
    static void main(String[] args) {
        // Composition = represents "part-of" relationship between objects.
        //               The engine is the part of the Car.
        //               Allows complex objects to be constructed from smaller objects
        //               The car cannot exist without engine

        //1.
        // Start by engine

        //3.
        Car car = new Car("Chevrolet", 2018, "V8");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine); //we will get hash code here, bcs an engine is the object (reference datatype)
        System.out.println(car.engine.type);
        //here (18th line) the code to call for engine type. We:
        //call for car object first
        //call for the engine in the car
        //then call for the variable

        // 4. We could also use the method to display engine type
        System.out.println(car.getEngine());
        System.out.println();

        //5. Lets create another method for engine

        //7. Test
        car.startCar();
    }
}
