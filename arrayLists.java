import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayLists {

    public static void main(String[] args) {
        
        // Arraylist = is an resizable array that stores objects 
        // you can store primitives in that case you will be using autoboxing 
        // Arrays are fixed in size but Arraylists can change(they are dynamic)

        // you have to import ArrayList class from the util package 
        // following the type of Arraylist you need to use the diamnond operator 
        // this has to deal with generics which is a future topic 
        // but for now we are going to specify what type of object we are going to store in our arrayList
        // and you can also use the appropriate wrapper class to store primitives 

        // for example if you need to store integers
        // we do need that diamond operator after the second arraylist 
        // you dont need to speficy the data type in second diamond operator java can infer that
        // this array list can store integers you just have to specify the type 
        ArrayList<Integer> list = new ArrayList<>();

        // add is a built in method of ArrayLists
        list.add(3);
        list.add(1);
        list.add(2); 

        System.out.println(list);

        // now if you were to doubles you would set the type as double and use the double wrapper class
        ArrayList<Double> gpas = new ArrayList<>(); 
        
        gpas.add(3.0);
        gpas.add(2.1);
        gpas.add(1.7); 
        
        System.out.println(gpas);


        // lets store strings 
        ArrayList<String> names = new ArrayList<>(); 

        names.add("Mayank"); 
        names.add("Manish");
        names.add("Reshma"); 

        System.out.println(names);

        // we have seen add which is a built in method of arraylists we can also use remove 
        // we can specify string or index
        names.remove("Reshma");
        names.remove(0); 


        System.out.println(names);


 
        ArrayList<String> cars = new ArrayList<>(); 

        cars.add("Toyota");
        cars.add("Audi"); 
        cars.add("Bugatti"); 

        System.out.println(cars); 

        // also the set method where you set a certain index to hold a different value 
        cars.set(0, "Nissan"); 
        System.out.println(cars);

        // to get an element at a certain INDEX you can use the get method 
        System.out.println(cars.get(2));  


        // you can also get the size of an array list 
        System.out.println(cars.size());


        // to sort your ArrayList you will use the collections framework call the sort method on your arraylist 
        // you do need to import the Collections class from the util package 
        Collections.sort(cars);
        System.out.println(cars);

        // you can use an enhanced for loop to iterate through the elements of an ArrayList 
        for(String car : cars){
            System.out.println(car);
        }


        // EXCERCISE 
        System.out.println();

        Scanner scanner = new Scanner(System.in); 

        ArrayList<String> foods = new ArrayList<>(); 
        int amount; 
        String food; 

        System.out.print("Enter the number of food you woud like to store: ");
        amount = scanner.nextInt(); 
        scanner.nextLine();

        for(int i = 0; i < amount; i++){
            System.out.print("Enter the food: ");
            food = scanner.nextLine();
            foods.add(food); 
        }

        System.out.println(foods);










        scanner.close(); 
    }
}