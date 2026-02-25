package c_staticKeyword;

public class Friend_nonStatic {
    //1.
    // Let's try to make a functionality that increments number of friends, each time the new friend is added
    int numOfFriends;
    String name;

    Friend_nonStatic(String name) {
        this.name = name;
        //let's add friend;
        this.numOfFriends++;
    }
}
