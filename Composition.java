public class Composition {
    // NOTE THE Che JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        // composition represents a part-of relationship between objects 
        // for example an engine is part of a car 
        // an object can be part of another object 
        // this allows complex objects to be constructed from smaller objects 

        // in this eg we are going to create a Che(car) object. The che object is composed of an engine object 
        // so lets create a class of che and a class of engine 

        // now lets construct a che object
        Che che = new Che("Pulsar", 2017, "1.2L"); 

        // then lets see if we have these details 
        // model and year is fine but for engine. 
        // che.engine is an object which is a reference datatype. so if you output it directly you are given a hashID to represent 
        System.out.println(che.model + " " + che.year + " "  + che.engine);
        System.out.println();

        // that engine object. so if we want the type of engine we need to access the engine object than get the type 
        System.out.println(che.model + " " + che.year + " "  + che.engine.type);
        System.out.println();

        // so its like we have an object that is compsoed of another object 
        // our engine is part of our car 

        // lets create a method for the engine 

        // now if we start the car
        che.start();


        // now a key difference with composition is if we delete our car object that should also delte our engine 
        // Because our engine is part of our car 



        
    }
}