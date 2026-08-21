public class toStringMethod {
    // NOTE THE Gadi JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        // .toString() method is inherited from the object class
        // whenever you create an object behind the scenes the object class is a super class
        // the .toString() method is used to return a string representation of an object
        // if you were to output it directly using sout the default behaviour of the .toString() method is that 
        // it returns a hashcode as a unique identifier for that object 
        // but it can be overridden to provide meanginful details which is why we learned method overriding  in the last lesson 

        // lets create a new Gadi class and create a gadi object
        // pass in the args our gadi constructor has
        Gadi gadi1 = new Gadi("Nissan", "Pulsar", 2017, "Wine"); 

        // gadi1 is an object if output it using sout 
        // techinically you are given a hashcode a unique identifier for that object 
        // the hashcode is a unique idnetifer created by the process of hashing, it uses the objects memory address 
        // to calculate a hash 
        System.out.println(gadi1);
        System.out.println();

        // wouldnt it better if we printed our gadi object direclty like we did before that we would instead get our gadi detaills
        // usually we would have to do this like this
        System.out.println(gadi1.make);
        System.out.println(gadi1.model);
        System.out.println(gadi1.year);
        System.out.println(gadi1.colour);
        System.out.println();

        // well we can do that using method overriding
        // lets go to our gadi class
        // now if we print our gadi object directly we get all the details of the gadi
        System.out.println(gadi1);


        // lets create a new gadi object
        Gadi gadi2 = new Gadi("Volkswagen", "Golf", 2017, "Red");
        System.out.println(gadi2);


        // objects inherit from the object class the object class does have a toString method 
        // but it can be overridden as we have done so that when you print an object directly 
        // it will display meaningful details 






    }
}