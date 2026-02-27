package i_polymorhism.Interface_case;

public class Boat implements Vehicle_interface {
    @Override
    public void go() {
        System.out.println("You sail the boat");
    }
}
