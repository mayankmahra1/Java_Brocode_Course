public class superKeyword {
        // NOTE THE Person & CollegeStudent & Employee JAVA FILE IS APART OF THIS LESSON 


    public static void main(String[] args) {
        
        // today we are discussing the super keyword
        // super refers to the parent class when using inheritance. (subclass <- superclass)
        // a child class is aka a subclass and a parent class is aka a superclass 
        // the super keyword is used within constructors and method overriding 
        // method overriding is a whole diff topic we will discuss we are more focused on constructors in this lesson 
        // we use the super key word to call the parent constructor to initliase attributes 
        // person will be the parent or the superclass


        // lets test what we have so far 
        // now lets create a person object and call the showName method on it 
        Person person1 = new Person("Mayank", "Mahra"); 
        person1.showName();
        System.out.println();
        
        // as we said our person class will be our parent or superclass
        // we'll create a few other classes to inherit from this person class 
        // we are going to create a class called CollegeStudent which is going to inherit the attributes and 
        // methods from our parent class 

        // now we should be able to create a college studnet object with a name and gpa
        CollegeStudent collegeStudent1 = new CollegeStudent("Mebin", "Manoj", 3.14); 
        collegeStudent1.showName();
        System.out.println(collegeStudent1.gpa);
        collegeStudent1.showGPA();
        System.out.println();

        // lets create one more class an employee class
        // now lets create an employee object 
        Employee employee1 = new Employee("Aman", "Rana", 35000);
        employee1.showSalary();

        
    }
}