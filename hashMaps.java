import java.util.HashMap;

public class hashMaps {

    public static void main(String[] args) {
        
        // hashmaps = a data structure they store a pair of values (key-Value pairs)
        // you have a key and a value associated with that key(maybe meant to say pair) 
        // keys have to be unique but values can be duplicated 
        // hashmaps do not maintain order but they are very memory efficent 
        // when creating a Hashmap we have to set up type parameters 
        // we have to specify what the data type of the key is and the value
        // HashMap<Key, Value> 

        // heres how to create a hashmap 
        // we'll need to import the class
        // if we look at hashmap class we have type parameters set up 
        // theres two values 
        // we can store any two types of values within a hashmap 
        // we have a key and a value represented by k & v
        // we have to send type arguments to the type parameters 
        // so when creating hashmaps we have to set up type arguments 
        // so after hashmap we have to list the data type of what we are storing 
        // these hvae to be refernce data types 
        // so lets say with our maps we are going to have products 
        // an item and a price
        // so for the item that could be a string and for price a double 
        // the way we have set this up is that we have told the hashmap class that we are going to store a string as a key 
        // and a double as the price


        HashMap<String, Double> map = new HashMap<>(); 

        // to put things into a hashmap call the put method 
       // weve specifed were storing a string and a double 
       // a string for the key and double for the value 
       // say we have a store and in it we sell produce  
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25); 

    
        // if we output our map directly 
        // we have all our key value pairs printed within the hash map
        // StringDouble, StringDouble, StringDouble 
        System.out.println(map);


        // for HashMap the keys have to be unique 
        // if you have duplicate keys you overwrite the previous key value pair
        // but it can be good if you want to overwrite one of key value pairs
        map.put("orange", 1000000.00);
        System.out.println(map);

        System.out.println();

        HashMap<String, Double> dealership = new HashMap<>();

        dealership.put("Honda", 19000.00);
        dealership.put("Range Rover", 35000.00);
        dealership.put("Mustang", 85300.00); 
        dealership.put("Bugatti", 150000.00);

        System.out.println(dealership);

        // to remove an element
        dealership.remove("Honda"); 
        
        System.out.println(dealership);


        // to get the value associated with a key use the get method    
        System.out.println(dealership.get("Bugatti"));



        // check to see if a key or value exists 
        System.out.println(dealership.containsKey("Mustang"));
        System.out.println(dealership.containsValue(85300.00));


        // we can use these within an if statement

        if(dealership.containsKey("Mustang")){
            System.out.println(dealership.get("Mustang"));
        }
        else{
            System.out.println("Key not found");
        }

        if(dealership.containsValue(85300.00)){
            System.out.println(dealership.get("Mustang"));
        }
        else{
            System.out.println("Value not found");
        }

        // size of a map 
        System.out.println(dealership.size());


        // when we print our a map we are given ugly formatting 
        System.out.println();
        System.out.println(dealership);


        // using a for loop we are going to cycle through all the key value pairs
        // we wil create an ehanced for loop 
        // we will iterate through every key and these have a string data type because thats how weve set them up 


        // for every in dealershep
        // what we have to do is get every key in our hashmap dealership and theres a a method for that mapname.keySet()
        for(String key : dealership.keySet())
            {
                System.out.println(key + " : $" +  dealership.get(key));
            }
        




        


    }
}