package i_polymorhism.Interface_case;

public class Boat implements Vehicle_interface, Technology {
    @Override
    public void go() {
        System.out.println("You sail the boat");
    }
    @Override
    public void info() {
        System.out.println("Boats for water");
    }
}

