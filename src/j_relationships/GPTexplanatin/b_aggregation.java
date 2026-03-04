package j_relationships.GPTexplanatin;

import java.util.List;

public class b_aggregation {
    //weak 'has-a' relationship
    // * One object contains another
    // * But CONTAINED object can exist independently
    //F.E: A team has players, but players can exist without the team
    public static class Player{
        String name;
    }
    public static class Team{
        List<Player> players; //aggregation
        //If the Team object is deleted, Player objects still exist
    }

}
