public class TalkingDog extends Dog2 {
// our talkingDog class extends our Dog2 class
// which means it inherits all its attributes and methods 

// we can overrride the speak method in the talkingDog class
// remmeber using the @Override annotation 
    @Override 
    void speak(){
        System.out.println("Hey shaggy");
    }
    
}