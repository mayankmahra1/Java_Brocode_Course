public class interfaces_polymorphism_runtimePolymorphism_POSTRECALL {

    public static void main(String[] args) {

        // An interface is similar to an abstract. you define it as public interface name rather than public absstract class name
        // the key differnces is that interfaces allow childs to inherit from more than one parent class 
        // given two interfaces a predator and a prey 
        // you define a method in both of these hunt and flee
        // void hunt(); and same for flee 

        // now you have three classes fish rabbit and hawk
        // when you create lets say hawk class you dont use the keyword extends but you use the keyword implements 
        // public class Hawk implements Predator 
        // now similar to abstract classes you get an error that either convert this Hawk class to an abstract class or define(implement)
        // the hunt method 
        // so you do that using the Override annotation for readability and the public keyword when definingg the method 
        // moreabout access modifiers later 

        // the same goes for rabbit except  for the flee methpd 

        // but fish can both hunt and flee. so fish implements both. public class fish implements prey, predator
        // to implement more than one interface you use a comma 
        // now for a fish class you will have define both hunt and flee method in the actual fish class
        
        // now in the main when you create a object fir all
        // hawk can only call hunt method 
        // rabbit can inly call flee method 
        // and fish can call both 

        // also good to know the definition. A blueprint is a class that specifies a set of abstract methods that the 
        // implementing class or classes must define. 



        



        // Polymorphism 
        // poly means many and morphism means shapes
        // so the idea is that objects can take many shapes or forms 

        // lets say we have an abstract class called automobile. now we cannot create an automobile object because its an 
        // abstract class. its too generic 
        // than lets create a kar, bike and boat classes 
        
        // the abstract automobile class contains an abstract method called go which must be defined by all the classes which 
        // inherit it. 
        // so when we create kar bike. and boat and we use the keyword extends for the automobile class these classes 
        // must define these methdos again using @Override annotation for readability and DO NOT use public here
        // thats only for interfaces 
        
        // we can create objects for all kar bike and boat classes and call the go method on each 

        // but what if i want to store these in an array 
        // whats the datatype of the array it would be automobile because everything else would cause an a erro
        // a bike can take the "Shape" of an bike and a automobile but not a kar and boat
        // a kar can take the "Shape" of an kar and a automobile but not a bike or a boat
        // and the same for a boat
        

        // so you would store these objects in an array of automobile objects like this 
        // Automobile[] automobiles = {kar, bike, boat}; 

        // than i could use for each loop to access each object if i wanted to 
        // for(Automobile automobile : automobiles){ }






        // finally runtime polymorphism 
        // this is the method that gets executed is decided at run time based on the actual type of the 
        // object 


        // simply using user input to instatiate an already declared object 

        // so we have a Animale abstract class and a Kat and a Dawg class 
        // so because our Animale class is abstract we cannot create Animale object
        // we cannot do this Animale animale = New Animale(); 

        // but we can create an Animale object and assign to a Dawg or kat object 


        // so if we just declare an Animale object we can assign to either a Dawg or a Kat object using user input 
        // Animale animale; // thats it 


        // then we use user input and if statments 
        // if(){animale = new Dawg()}


        // so key takeaway is we declare an animal object but we instatitate it at runtime with a Dawg or a Kat object. 



        
    }
}