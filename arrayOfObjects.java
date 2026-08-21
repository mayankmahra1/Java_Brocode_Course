public class arrayOfObjects {
// NOTE THE Vehicles JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        
        // how we can create an array of objects using java 
        // we will begin by creating a new class 

        // lets create a vehicle object
        Vehicles vehicle1 = new Vehicles("Nissan", "Wine"); 
        Vehicles vehicle2 = new Vehicles("Ford", "Grey"); 
        Vehicles vehicle3 = new Vehicles("Audi", "Silver"); 

        // when can create an array but to create an array we need to list the data type of what we are storing 
        // we are going to be storing vehicle objects. so the data type of our array is vehicle objects
        // name of our array is vehicles
        // if you are creating an empty array you are going to use the new keyword list the datatype (in this case Vehicles)
        // then square brackets and specify the size of the array

        // the next commented line says 3 elements max
       // Vehicles[] vehicles = new Vehicles[3]; 

       // or we can assign them right away to using a set of curly braces
       Vehicles[] vehicles = {vehicle1, vehicle2, vehicle3}; 
       System.out.println(vehicles); // this is the array of vehicle objects
       System.out.println();

       // you can use a for loop to iterate through this array
       // you access the vehicle obejct at a given index from the array of vehicle objects
       for(int i = 0; i < vehicles.length; i++){  
        System.out.println(vehicles[i]); // this is each vehicle object within the arrat
       }
       System.out.println();

       // you access the vehicle obejct at a given index from the array of vehicle object and then you use the dot operator to get
       // the model and colour
       // also calls the drive method
       for(int i = 0; i < vehicles.length; i++){  
        System.out.print(vehicles[i].model); // this is model and colour of each vehicle object within the array
        System.out.println(" " + vehicles[i].colour);
        vehicles[i].drive();
       }
       System.out.println();

       // we can also use an enhanced for loop
       // what is the data type of each element in this array
       // we are accessing the array of vehicle objects so our data type in the enhanced for loop must match
       // remeber the array called vehicles stores objects of the datatype Vehicles
       // this prints each individual vehicle object
       // also calls the drive method
       // for every Vehicles object in our array of vehicles
       for(Vehicles vehicle : vehicles){
        System.out.println(vehicle);
       }
       System.out.println();

       // this then uses the dot operator to get the model and colour
       // also calls the drive method
       for(Vehicles vehicle : vehicles){
        System.out.print(vehicle.model);
        System.out.println(" " + vehicle.colour);
        vehicle.drive();
       }
       System.out.println();


       // another thing u can do to when creating an array of objects is you can pass in anonymous obejcts
       // rather than first instatiating the objects than assigning them to the array 
       // this how we do that 
       // we will create a new array of vehicles
       // for each element we are going to call the Vehicles constructos
       // constructing an object wihtout giving the object a uniqure identifier like vehicle1, vehicle2, vehicle3
       // these are known as anonymous objects
       Vehicles[] vehicles2 = {new Vehicles("Kia", "Black"), 
                               new Vehicles("Toyota", "Blue"),
                               new Vehicles("BMW", "White")};

       // and this does the same thing 

       // we can also change the colour for each car
       for(Vehicles key : vehicles2){
        key.colour = "black"; 
       }

       // and lets see the changes
       for(Vehicles key : vehicles2){
        key.drive();
       }




 

    }
}