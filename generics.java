import java.util.ArrayList;

public class generics {

    public static void main(String[] args) {
        // generics = its a concept where you can write a class interface or a method 
        // and its compitable with different data types 
        // theres 2 things we need 
        // <T> type parameters a set of angle brackets with a letter inside 
        // basically this acts as a placeholder that gets replaced with a real type 
        // <String> type argument (Specifies the type )
        // we send args to params 
        // really our type parameter is just acting as a placeholder 
        // anything that uses this type paramter doesnt know the data type its going to receive 
        // its set up to receive pretty much anything or a primitve using a wrapper class 


        // generics are used in ArrayLists 
        // we put angle brackets after ArrayList. what is this array going to store
        // java can infer the second angle bracket based on first
        // we have an ArrayList which can store strings we have specfied the type argument 
        
        // currently the way we set up this arraylist its compatible with strings because thats what we set the type argument to be
        // if i change <String> to Integer than we can store Strings but we can store numbers 
        // generally speaking an ArrayList data structure can store all sorts of different data types
        // but when we create an ArrayList we have to speicfy what we are storing thats the type argument 
        // thats because within ArrayList class we have type parameter set up a set of angle brackets with a letter inside




        

        ArrayList<String> fruits = new ArrayList<>(); 

        fruits.add("apple"); 
        fruits.add("banana");
        fruits.add("orange");

        // we when jump to source at look at the class of our arraylist 
        // a lot of advanced java but pay attention to the type paramter that comes after the arraylist clas name
        // <E>  which means elements becasue an Arraylist has elements of data 
        // by using this type parameter our array list is set up to store elements of various types 
        // we just have to specify what the type is gonna be when we actual store data
        // and in our example its strings
        // but as we mentioned we can change the datatype of what we are storing we just have to change the type argument 
        ArrayList<Boolean> answers = new ArrayList<>();
        answers.add(true);
        answers.add(false); 
        answers.add(true); 

        // Now what we are going to do is use type parameters 
        // using genrics u can write some logic within a class interface or method and its compatible with many different 
        // data types 


        // now we will attempt to create a box object 
        // missing one step 
        // we need to set up a type argument
        // what are we going to be putting in our box 
        // whats its data type
        // now have a box object which is set up to store strings 
        Box<String> box = new Box<>(); 

        // lets add some items to our box 
        // weve even created a  method for this 
        box.setItem("banana");

        // now we will get the item from the box
        System.out.println(box.getItem());


        // our box class is comptatible with all sorts of data types
        // this time lets store an integr 

        Box<Integer> box1 = new Box<>(); 

        box1.setItem(3);

        System.out.println(box1.getItem());



        // basically with our box class we are writing the logic to how our box works 
        // you put something in setItem and take something out getItem and its compatible with different data types 
        // we just have to use a type argument when creating a box object. java has to know what we intend to store in it 



        // ANOTHER EXAMPLE 
        // With type parameters you can have more than 1 type 
        // we can have 2 or more different types 
        // common naming convention is <T, U> ... 


       // remember we need our type arguments 
       // this time we need two type arguments because our prodcut is set up to receive 2  
       // now we have to pass in arguments to the class because we have a constructor
       // we have an item and a price
        Product<String, Double> product1 = new Product<>("apple", 0.50); 

        // now lets create two methods in our prodcuct class

        // we have our product object 
        // so lets output our item and price
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        // lets create a second product 

        Product<String, Integer> product2 = new Product<>("ticket", 15);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());

        // basically we are writing the logic to how this class works 
        // and its compatible with all different types 
        // you just have to set up a type parameter 
        // and pass in type arguments 

















    }
}