public class Car {

    // a class can behave as a blueprint for creating our objects 
    
    // we are going to start by listing the different attributes our car may have 
    // things that the car(object) has are known as attributes 
    String make = "Nissan"; 
    String model = "Pulsar"; 
    int year = 2017; 
    double price = 10000.00;
    boolean isRunningRn = false; 

    // we dont need static keyword because we dont have a main method 
    // we are doing everything in the class
    // void becasue we are not returning anything 

    void start(){
        isRunningRn = true; 
        System.out.println("You start the engine");
    }
    
    void stop(){
        isRunningRn = false; 
        System.out.println("You turn off the engine"); 
    }

    void drive(){
        System.out.println("You are now driving the " + make + " " + model);
    }

   
}