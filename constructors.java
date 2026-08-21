public class constructors {
    // NOTE THE STUDENT JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        // constructors = is a special method within in a class used to intiliasie objects
        // by using a constructor you can create objects with unique values 
        // when you create an object you can pass arguments to a constructor and set up initial values 
        // lets go ahead and create a new java class of students 
        // when we pass in arguments in the main java file we need to ensure that student class has attributes
        // has a constructor and that that constructor is set up to take arguments
        // now that we have set up our parametes for our constructor. we can pass in our arguments
        // we only pass in arguments in relation to the number of parameters of the
        //  constructor not in relation to the number of attributes
        Student student1 = new Student("Mayank", 22, 77.3); 
        Student student2 = new Student("Nathan", 21, 63);
        Student student3 = new Student("Tanish", 21, 55.2);

        System.out.println(student1); // reference datatype 
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();
        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();
        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();






    }
}