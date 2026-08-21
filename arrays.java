import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {

        // an array is a collection of values of the same data type 
        // think of it as a var that can store more than one value 
        // a packet of chewits 

        String[] fruits = {"Apple", "Banana", "Orange", "Coconut"};  // good descriptive name 

        
        // arrays fall it category of a reference data type 
        // if we access the name of our array we are given a memeory address 
        // to access an element of an array we have to use square brackets with an index 
        System.out.println(fruits[0]);

        // if we attempt to access an element which does not exist we can get an array out of bounds error/exception!
        // System.out.println(fruits[4]);

        // to change the value at a given index 

        fruits[0] = "pears";

        System.out.println(fruits[0]);

        // to get the length of an array 
        int length = fruits.length; 
        System.out.println(length);


        // ehanced for loop // for each loop 
        // to print all elements of an array 
        // for String fruit : fruits
        // for every fruit in my array of fruits
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println();

        // you can sort your array wiht built in sort array
        // you need to import the array class 
        
        Arrays.sort(fruits); // sorts array alphabetically. If numbers it would be arranged in ascedning  order
    

        for(String fruit : fruits){
            System.out.println(fruit);
        }
        

        // also fill method where we can fill all the elements in an array with a given value 
        Arrays.fill(fruits, "Mangos");

        System.out.println();

        for(String fruit : fruits){
            System.out.println(fruit);
        }




        
    }
}