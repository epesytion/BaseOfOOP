package c_staticKeyword;

public class Main {
    //Start by class "Friend_nonStatic"
    String name;
    public static void main(String[] args) {
        //2. Next, we have to get number of friends equal to 2, if we create 2 objects of class Friend_nonStatic
        Friend_nonStatic friendNonStatic1 = new Friend_nonStatic("SpongeBob");
        Friend_nonStatic friendNonStatic2 = new Friend_nonStatic("Patrick");

        System.out.println(friendNonStatic1.numOfFriends);
        System.out.println(friendNonStatic2.numOfFriends);
        //but both have '1'
        //It happens, because each time we create a new object, we really create something NEW.
        //And each time, the numOfFriends in "Friend_nonStatic" is the new distinct variable for the every instance of class

        //So we need static variables - make a variable or a method belong to the class itself,
        //rather than the specific object

        //3. Go to "Friend_static" class

        //4.
        Friend_static friendStatic1 = new Friend_static("SpongeBob");
        Friend_static friendStatic2 = new Friend_static("Patrick");
        System.out.println(friendStatic1.numOfFriends);
        System.out.println(friendStatic2.numOfFriends);
        System.out.println();
        //5. As you noticed, the 23 and 24 lines are yellow underlined. So compiler offers to do better:
        //When accessing a static varibale/method, it's actually best to do so through the class itself (Friend_static)
        System.out.println("Static variable: " + Friend_static.numOfFriends);  //debugged 23-24 lines


        //6. we can also use 'static' with methods (go to Friend_static)
        //7. Output
        Friend_static.showFriends();
    }
}
