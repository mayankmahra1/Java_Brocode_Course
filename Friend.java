public class Friend {

    // lets say we would like to keep track of how many friend objects we would like to create well that could be an attribute
    // so preceed it with the static modifier
    // rather than all friend objects having there own copy which is the case with numOfFriends
    // They are all going to share one -> accNumOfFriends
    // its as if all these objects are sharing the accNumOfFriends variable 
    // but rather than any one object having ownership of this variable the Friend class owns it and all friend1 friend2.. 
    // objects have access to it
    int numOfFriends;
    static int accNumOfFriends; 
    String name; 

    // when we construct a friend object we have to pass a string of name
    // whenever we create a friend object we will increment numOfFriends by 1
    Friend(String name){
        this.name = name; 
        numOfFriends++;
        accNumOfFriends++;
    }

    // methods can also be modified by the static keyword
    // normally when you access an attribute you use the this keywors
    // but if your using a static attribute you dont need the this keyword
    static void showFriends(){
        System.out.println("You have " + accNumOfFriends + " Friends");
    }
}