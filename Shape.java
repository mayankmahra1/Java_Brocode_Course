public abstract class Shape {
    // add abstract keyword which means we cant create any shape objects 


    // lets define an abstract method 
    // use the abstract keyword and lets list a return type of double 
    // every child class of the shape class needs an area method 
    // this is an abstract method
    // then if we go to our circle or other child classses after declaring this abstract method we get
    abstract double area(); // abstract method

    // now for concrete methods which are kind of the opposite of abstract methods 
    // concerte methods are defined and inherited within an abstract class
    // lets define a method of dispaly
    // in an abstract class a concrete method is inherited 
    // within our circle triangle and rectangle classes we dont need to implement it. we dont need to override it 
    void dispaly(){ // concrete method 
        System.out.println("This is a shape");
    }
   


}
    
