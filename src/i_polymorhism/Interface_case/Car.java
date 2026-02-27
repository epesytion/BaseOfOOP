package i_polymorhism.Interface_case;

public class Car implements Vehicle_interface{
    @Override
    public void go(){
        System.out.println("You drive the car");
    }
}
