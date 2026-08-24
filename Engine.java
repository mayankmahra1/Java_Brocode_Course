public class Engine {

    // lets say engines have a string of type. you could say enginetype but that would be redunant id say so lets just say type
    String type; 

    // then we need a cosntructor 
    // now back to our che class
    Engine(String type){
        this.type = type; 
    }

    // then afte this lets go into the car method and create start class
    void start(){
        System.out.println("You start the engine which is a " + this.type);
    }



    
}