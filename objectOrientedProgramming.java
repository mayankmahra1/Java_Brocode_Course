public class objectOrientedProgramming {

    // this lesson is associated with car class

    public static void main(String[] args) {
        
        // Object = In programming an object can represent a real world entity that can do a few things
        // hold data (attributes)
        // and can perform actions (methods)
        // The data they hold are called attributes and the actions they perform are called methods
        // a person is an object. 
        // some attributes they may have are their name, age, height
        // some methods they can perform are eat and sleep 
        // it is a refernce data type 
        

        // we store the data for the object in a location known as the heap
        

        // now lets create  a car object
        // we are already familiar with working with objects eg a scanner is an object
        // we now have a car object we can use 
        Car car = new Car(); 

        // our car object has attributes 

        // if i were to print my car object heres what we can see
        // since our car is a reference data type if we were to print our car directly we would get a memory address
        System.out.println(car);

        // if you want to access one of these attributes you have to follow the object name with the dot . operator
        // it allows you to access things within an object 
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunningRn);

        // you can modify and change attributes to 
        car.price = 9500; 
        System.out.println();
        System.out.println(car.price);

        System.out.println();


        // objects can have their own methods 
        // within our methods we can also change our attributes/vars 
        System.out.println(car.isRunningRn);
        car.start(); 
        System.out.println(car.isRunningRn);
        car.stop(); 
        System.out.println(car.isRunningRn);
        
        System.out.println();

        // driving method
        car.drive(); 
        
        System.out.println();


        // there is one issue with this however 
        // with our class of car every car that we make has the same attributes and methods 
        // right now we can only create 2017 nissan pulsars 
        
        // if i create another car object and prints its attributes and use its methods and compare it to my first car object
        // i get the same attributes
        // it would be nice if i had a way to customise them so that each car is unique becasue currently they are all the same 
        // they are different cars but they have the same attributes and methods
        Car car2 = new Car(); 
        System.out.println(car.make + " " + car.model);
        System.out.println(car2.make + " " + car2.model);

        // thats why in the next video we are going to discuss constructors
        // by passing in arguments we can create unique objects 
        // 


        
        



    }
}