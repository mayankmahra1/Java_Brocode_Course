public enum Day {
    // Within in this java class we can declare some constants 
    // What we are going to write is enum constants 
    // A common convention for these constants is that all the letters are uppercase 
    // After the enum constant and a set of paranthesis and associate a value inside with it 
    // Lets say were working with days of the week and sunday is the first day of the week
    // Aight we have our enum constants and they have values one through seven 
    // We are receiving a warning and the fix is telling us to remove the arguments 
    // What we need to do is create a constructor 
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7); 

    // A constructor for our day class
    // When we define these enum constants we are automatically going to call this constructor for this enum class
    // and then pass in this value 

    // lets create a field of day number for days of the week 
    // we'll make this values private using the private access modifier 
    // we don't want the ability to change them so we'll also make them final 
    private final int dayNumber;

    // When we define the enum constants above we are automatically going to call the constructor and pass in the value 
    // which in the arguments of when we made the enum constants to the constructor 

    // for our parameters its as follows
    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    // you can add a getter method to get the day number 
    // we'll use the public access modifier so we can access all info within this class
    public int getDayNumber(){
        return this.dayNumber; 

    }

    // now how do we work with these enum constants 
    // Thats where we go back to our main java file 




}