
// we are using a type paramter to store all sorts of diff things in our box 
// we can store strings ints double booleans and even more complex objs 

// t is common convention meaning type 
// when we create a box obj our box is going to act as a container 
// we'll store a value inside
public class Box<T> {

    // our box is going to be a resuable class 
    // we dont always know the data type of what were storing is going to be
    // so what we could do is to set the data type to be T 

    // with T it does mean type but i like to think of it as thing
    // we are storing a thing an item within our box 
    // we dont know what this thing/t is going to be 
    // if its always going to be string we could set it to be a string same for int etc
    // String item;
    T item; // we are storing an item within our box 


    // lets create a method were we will set our item 
    // void cuz no returning 
    // we'll have one parameter 
    // whats the data type of what were receiving 
    // we dont know so we are going to use are type parameter of T 
    // T is the data type. its generic 
    // we wil receive an item
    // lets take this.item and set it to be the item we receive 
    public void setItem(T item){
        this.item = item; 
    }

    // we'll create a method to get our item 
    // now we are going to be returning an item the data type is T so
    public T getItem(){
        return this.item; 
    }


    // so far we can put things in our box 
    //and we can get things from our box 
    
    
    // our class is done 
    // our box class is set up to be reuseable 
    // we can store all sorts of diff things in our box 


     




}
