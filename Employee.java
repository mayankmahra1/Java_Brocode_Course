public class Employee extends Person{

    // employee also inherits from the person class. so person is superclass and employee is subclass
    // since employees arent studying they dont have a gpa but a salary 
    int salary; 

    // then we need the construtor for our employee object
    // all employees require the following arguments 
    // since employee extends person  and our person construtor requires a firstname and a lastname 
    // we have to send our person constructor these arguments firstname and lastname so we
    // call the constructor of our parent using the super keywrod and pass in these arguments

    Employee(String firstName, String lastName, int salary){
        super(firstName, lastName); 
        this.salary = salary; 
    }

    void showSalary(){
        System.out.println(this.firstName + "'s salary is " + this.salary);
    }

}