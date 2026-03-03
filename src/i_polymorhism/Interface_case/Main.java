package i_polymorhism.Interface_case;

public class Main {
    static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle_interface[] vehicles = {car, bike, boat};
        for(Vehicle_interface vehicle : vehicles){
            vehicle.go();
        }

        System.out.println();

        Technology[] techs = {car, bike, boat};
        for (Technology tech : techs) {
            tech.info();
        }

        System.out.println();

        /* IT IS ERROR TO COMBINE TO INTERFACES (TWO DATATYPES)
        Vehicle_interface[] vehicles2 = {car, bike, boat};
        for(Vehicle_interface vehicle : vehicles2){
            vehicle.go();
            vehicle.info(); //err
        }
         */


    }
}
