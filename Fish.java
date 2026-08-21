public class Fish implements Prey, Predator {

    // now fish hunt smaller fish and flee larger fish they could be considered both prey and predator 
    // so we are going to implement both interfaces 
    // and you just seperate the interfaces with a comma if you want to implement more than one 

    // now we get an error again. Since we implemneted both the prey and predator class we have to implement both their
    // methods also 

    // dont forget public keyword when implementing interfaces 
    @Override
    public void flee(){
        System.out.println("The fish is fleeing");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }

   
    
}