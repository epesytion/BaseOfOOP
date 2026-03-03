package i_polymorhism.Interface_case;

public class Bike implements Vehicle_interface, Technology {
    @Override
    public void go() {
        System.out.println("You ride the bike ");
    }
    @Override
    public void info() {
        System.out.println("Bike is cool");
    }
}
