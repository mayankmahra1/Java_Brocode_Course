public class Kar extends Automobile {

    // first a kar class which extends the automobile class 


    // but there is an abstract method of go that we need to define/implement 
    // override and public is essential to remeber when it comes to interfaces only not abstract classes
    @Override
    void go(){
        System.out.println("You drive the kar");
    }


    
}