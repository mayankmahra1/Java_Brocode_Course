public class polymorphism {
    // NOTE THE automobile, automobile2, Kar, bike and boat FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        // polymorphism 
        // poly means many
        // morph means shape 
        // together you get the concept of many shapes or forms 
        // objects can identify as other objects(objects of different  types)
        // objects can be treated as objects of a common superclass 

        // so a dog identifies as a dog but it can also identify as a animal, it can also identify as an organism and it can
        // also identify as an object. It can identify as more than one thing 
        
        // lets start by creating a superclass of automobile 


        // now lets create our objects for each class
        Kar kar = new Kar(); 
        Bike bike = new Bike(); 
        Boat boat = new Boat(); 

        // each of these objs has a go method 
        kar.go();
        bike.go();
        boat.go();
        System.out.println();

        // lets say we would like to have a race. we are going to place all of these objects within an array 
        // so what should the data type of the array be 
        // lets attempt to create an array of kar objects and place our bike and boat within it 
        // we are getting an error. bike and boat cannnot be converted to type KAr
        // Kar[] array = {kar, bike, boat};


        // bikes and boats dont identify as Kars. only kars iddenitfy as cars 
        // thats one of the "shapes" bikes and boats dont have they dont identify as bikes 
        // now if i did this // Bike[] array = {kar, bike, boat};
        // than i would get an error for kar and boat because they dont identify as bikes 


        // but what we can do is delcare our array to what they have in common 
        // our kar bike and boat all extend the automobiles class and you could say they also identify as automobiles
        // so lets try by changing the data type of our array to Automobiles 
        // kars identify as kars but also automobiles and the same applies for all
        // so they have many shapes or forms. 
        Automobile[] automobiles = {kar, bike, boat}; 

        // for every object in this array i would like each object to use its go method like were racing.
        // and we could do that using a for each loop
        for(Automobile automobile : automobiles){
            automobile.go();
        }

        // we can do the exact same thing with interfaces also 
        // polymorphism can be achieved using interfaces also
        // interfaces require access modifiers (public) when implementing methods whilst abstract classes do not. 





        
    }
}