public class Rabbit implements Prey {
    // rabbits are typically considered prey not predators
    // so the rabbit class implements the prey class
    // the reason for the error when we implement the prey class is because in we have not implemented the flee method in
    //  our rabbit class. so the error says either make this class abstract or implement the flee method 
    // the prey interface is saying to the rabbit class hey if your going to implement me you need to define this method of flee


    // we are going to override this method and have the annotation for readbility
    // we want to add the keyword public becasue this is a publicly accessible method 
    // when implementing or inheriting methods from Interfaces  when you define that method in the 
    // child class you must use the public keyword
    // because the method is publically accessible 
    @Override
    public void flee(){
        System.out.println("The Rabbit is running");
    }

    
}