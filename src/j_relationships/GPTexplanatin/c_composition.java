package j_relationships.GPTexplanatin;

public class c_composition {
    //Strong 'has-a' relationship (part-of)
    // * The contained object can't exist without the owner
    // * Strong dependency
    //A House is destroyed -> rooms don't exist (Not as the 'team' example, where it's okay to delete team)
    static class Room{

    }
    static class House{
        Room room;
        House(){
            room = new Room(); //composition
        }
        //Room is created inside the House
    }


}
