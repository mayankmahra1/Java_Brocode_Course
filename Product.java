// here we are going to write the logic of how a product works 
// with a product you have an item and a price 
// you will set up a type paramter 
// you will have on type T and another U

public class Product<T, U> {

    // we will have a generic type of price and item 
    // we dont know if our item is going to be a string or a more complex data type
    // our price could a integer floating point num, double we dk
    T item; 
    U price; 

    // now we need our constructor we will take our product and set up our parameters
    // we'll take our product than set up some parameters 
    // the data type of our item is T and of our price is U 
    // this.item = the item we receive and same for price
    Product(T item, U price){
        this.item = item; 
        this.price = price; 
    }

    // method to get an item 
    // we are returning an item the data type is T
    public T getItem(){
        return this.item;
    }

    // method to get price
    // we are returning a price the data type is then U 
    public U getPrice(){
        return this.price;
    }




}
