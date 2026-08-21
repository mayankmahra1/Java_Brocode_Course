public class methodOverriding {
    // NOTE THE Janvar, Kuta, Billie and Machi JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        // method overriding is when a subclass provides its own implementation of a method 
        // rather than use one thats inherited from  a parent (already defined)
        // it allows for code reusability and you can give specific implementations of a method 

        // we created our machi billie janvar and kuta class
        // our machi billie and kuta class our going to extend our janvar class
        // all these classes our subclasses or children of our janvar class so dont forget to use the keyword extends
        // when creating the class

        // lets construct our object
        Kuta kuta1 = new Kuta(); 
        Billie billie1 = new Billie(); 
        Machi machi1 = new Machi(); 

        // currenlty we have our kuta, billie and machi are running
        // but machi dont have legs they cant run they can only swim
        // the move method the machi inherits isnt approiate for the machi class
        // this animal is swimming would be more appropriate
        // so within the fish class why dont we do some method overriding
        // now that we have writtien that @Override method lets see what happens when we call the move method on our fish object
        // now our machi is swimming 
        kuta1.move();
        billie1.move();
        machi1.move(); 
        

    }
}