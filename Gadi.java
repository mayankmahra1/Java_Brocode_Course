public class Gadi {

    // all gadis should have the following attribute 
    String make; 
    String model;
    int year;
    String colour;

    // we need a constructor to assign these each attributes to each unique object
    Gadi(String make, String model, int year, String colour){
        this.make = make; 
        this.model = model;
        this.year = year; 
        this.colour = colour;
    }


    // going to the gadi class we can do it using method overriding
    // we do need this keyword of public this is a publicly accessible method 
    // the return type is string and the name of the method is toString
    // rememeber to use this keyword which refers to the object we are currently working wiht
    @Override
    public String toString(){

        return this.make + " " + this.model + " " + this.year + " " + this.colour;

    }

    



}