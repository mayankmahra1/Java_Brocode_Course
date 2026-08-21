public class Dawg extends Animale {
    
    // Dawg class extends the Animale abstract class 

    // we get the typical error that we have not yet defined the speak class in the parent abstarct class
    @Override 
    void speak(){
        System.out.println("The Dawg goes woof");
    }

    
}