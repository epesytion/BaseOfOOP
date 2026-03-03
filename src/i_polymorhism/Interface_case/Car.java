package i_polymorhism.Interface_case;

public class Car implements Vehicle_interface, Technology{
    @Override
    public void go(){
        System.out.println("You drive the car");
    }

    @Override
    public void info(){
        System.out.println("Car is popular");
    }
}
