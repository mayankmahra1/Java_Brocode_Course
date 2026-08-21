public class Voiture {
    // a few attributes that voitures can have 
    // lets add private. now we cant access these attributes
    private final String model; 
    private String colour; 
    private int price; 
    
    

    // then we will need a Voiture constructor
    Voiture(String model, String colour, int price){
        this.model = model; 
        this.colour = colour; 
        this.price = price; 
        
    }

    // in the voiture class we'll create. lets start with the model 
    // the return type will be String because our model attribute is of a string datatype 
    // well create a getter method following this naming convention 
    // getAttributeName
    // all we are going to do is return this.model 
    // and then we will do this for the rest of the attributes which are private in this case all of them
    String getModel(){
        return this.model; 
    }

    String getColour(){
        return this.colour; 
    }

    String getPrice(){
        return "€" + this.price;
    }


    // now for setters. i dont want the model attribute to writable. Once weve declared the model of our car we dont want to 
    // change it. Our pulsar cant randomly become a bmw.  but the colour and price is something we can change. 
    // so for that reason we will declare setter methods for our colour and price but not our model because we do not 
    // want the model attribute to rightable
    // we can also add additonal logic in setter methods lets look at it for price
    void setColour(String colour){
        this.colour = colour; 
    }

    void setPrice(int price){
        if(price <  0){
            System.out.println("Price can't be less than zero");
        }
        else{
            this.price = price;
        }
    }



    
}