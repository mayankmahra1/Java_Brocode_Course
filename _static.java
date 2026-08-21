public class _static {
    // NOTE THE FRIEND JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        
        // static is a keyword that modifies a variable or method so that it belongs to a class rather than to any specifc object
        // we see the static keyword within the main method. when you modify a variable or method with the static keyword
        // static is used to create utility methods or other shared resources

        // heres a demo. first lets create a friend class

        // lets construct two friends
        // if we print our friends name we can see it matches
        Friend friend1 = new Friend("Mohit"); 
        Friend friend2 = new Friend("Mebin"); 
        Friend friend3 = new Friend("Narendr"); 
        Friend friend4 = new Friend("Shubham");
        Friend friend5 = new Friend("Aman");


        // if we output friend1 numOfFriends it should be one 
        // so if we create a second friend object then it should be two right?
        // each friend object has there own copy of numOfFriends variable
        // when we create friend1 we are incremeneting its copy of NumOfFriends by 1
        // and the same for friend2 we are incrementing friend2's copy of NumOfFriends by 1 not a shared one
        // if we want to keep track of the total number of friends we created we can do that with the static modifier
        // 
        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.numOfFriends);
        System.out.println();

        // lets print accNumOfFriends now
        System.out.println(friend1.accNumOfFriends);
        System.out.println(friend2.accNumOfFriends);
        System.out.println(friend3.accNumOfFriends);
        System.out.println();

        // we are getting a suggestion. when accessing a static variable or calling a static method its actually 
        // best to do so through the class itself rather than the object
        // its better this way so that you and other developers know hey you are accessing a static attribute 
        System.out.println(Friend.accNumOfFriends);
        System.out.println();

        // to call a static method type the name of the class followed by . and then the method name
        Friend.showFriends();
        System.out.println();


        // another place in which you see static members is the Math class
        // lets say you wanted to round a number you would say
        // round is a utility method we access it through the class name Math
        // you dont need to create a math object called math1 then access the round utility method through that that would be silly
        // round is a static method it behaves as a utility method 
        Mamth.round(4.5);
        

    }
}