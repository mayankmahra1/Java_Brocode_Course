public class Student {


    // what are some attributes a student should have 
    // if i assign a name right here eg String name = "Spongebob"; then every student will have the name spongebob
    // so every student object i create will have the name Spongebob 
    // so in order to give each object a unique name or in a broader view unique attributes we use the help of constructors
    String name; 
    int age; 
    double gpa; 
    boolean isEnrolled; 


    // a constructor is just a special method within a class
    // to set up the constructor we type the name of the class followed by a set of paranthesis then a set of curly braces
    // we automatically call this constructor when we instantiate an object in the java file of that class 
    // so when we say this in the main java file Student student = new Student(); we automatically call this constructor
    // we can set up parameters in the student class
    // and we can pass in arguments. pass in arguments when we create the student object in the java file 
    // to assign these attributes we have to use the this keyword
    // so its this
    // follwed by the dot operator
    // followed by the name of the attribute in Student class 
    // which equals the argument passed in when creating the student object in java file which we accept as parameters in our
    // constructor as name
    // with the this keyword this refers to the object we are currently constructing or otherwise working with
    // this refers to the object we are currently working with
    // imagine this being replaced with student1, student2 etc 
    // whenever you see this replace with the name of an object for help visually
    // the parameters for the constructor dont have to have the same name as names of the attributes but its better practice
    // theres a commented out example of this below EG2
    // you dont always need to assign arguments to these attributets
    // lets just say when you are a student you are enrolled. you dont need to pass an argument for that
    // now when create a student object in the main file we are already setting isEnrolled to be true 


    Student(String name, int age, double gpa){
        this.name = name; 
        this.age = age; 
        this.gpa = gpa; 
        this.isEnrolled = true; 
    }

    /*Student(String a, int b, double c){ // EG1
        this.name = a; 
        this.age = b; 
        this.gpa = c; 
    } */


    // if our class has any methods. in our eg all students have the method to study 
    // look how imperative the this keyword is 
    // student1 were to call the study method imagine replacing it with student1.name + " is studyin rn"
    // whenever you see this replace with the name of an object for help visually
    void study(){
        System.out.println(this.name + " is Studying RN DND");
    }
    
}