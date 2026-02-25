package c_staticKeyword;

public class Friend_static {
    String name;
    static int numOfFriends;
    Friend_static(String name) {
        this.name = name;
        numOfFriends++;
    }
    //4. Try to output the number of friends (main class)

    //6.
    /*
    static void showFriends() {
        System.out.println("you have: " + this.numOfFrieinds);  //here, if we write "this." keyword, it will be an error
        //we don't need 'this.' keyword, bcs the method and the variable are already belongs to class itself, we don't need
        //to do reference
    }
    */
     static void showFriends() {
        System.out.println("you have: " + numOfFriends + " friends");
    }
    //7. try to output
}
