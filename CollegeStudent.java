public class CollegeStudent extends Person {

    // since  college student is inheriting from person,  college
    //student is going to have a first and last name already and a show name method 
    // what other attributes does a college student have that a person might not 

    double gpa;    
    
    
    // we are going to create a college student constructor 
    // lets say when we create a  college student we need to pass a string for first name and last name 
    // rather than assigning there first and last name within this constructor such as this.firstName = firstName
    // we get a warning when we try that 
    // we are not able to assign these attributes of firstName and lastName within the construcor for collegeStudent this is 
    // becasue student inherits from the person class. since the constructor of our parent requires a first and last name 
    // we have to pass the argumemnts to the parent of CollegeStudent aka Person 
    // how we can do that is by using the super keyword. any arguments the parent or super class requires
    // we have to send the parent these arguments from the child constructor and how we do that is use the super keyword
    // now java is happy 
    // super just refers to parent imagine we replaced the super keyword with Person
    CollegeStudent(String firstName, String lastName, double gpa){
        super(firstName, lastName);
        this.gpa = gpa; 
    }   

    // lets also create a method to display their gpa 
    void showGPA(){
        System.out.println(this.firstName + " your gpa is " + this.gpa);
    }


    
}