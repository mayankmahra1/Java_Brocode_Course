public class Person {

    // a person will have the following attributes 
    String firstName; 
    String lastName; 

    // we need a constructor remember constructors are going to be the same name as the class name 
    // when we construct a person object in the main java file we will need to pass in the following args that we have set up as 
    // parameters
    // think of it as Person1.firstName = firstName(argument user passes in)
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // well create one method calls show name it wont return anything 
    // look how we use the this. keyword and operator
    void showName()
    {
        System.out.println(this.firstName + " " + this.lastName);
    }

}