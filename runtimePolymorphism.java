import java.util.Scanner;

public class runtimePolymorphism {
    // NOTE THE ANIMALE, Dawg and Kat JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        
        // runtime polymorphism aka dynamic polymorphism 
        // runtime polymorphism = when the method that gets executed is decided at run time based on the actual type of the 
        // object 

        // in this example a users going to pick a type of animal they want as a pet,  a dawg or a cat 
        // but thats going to be determined at runtime after the programme is already running 
        // we will create a total of three classes 


        // since animale is an abstarct class we cannot create any animale objects they are too generic 
        // the error will be animale is abstract it cannot be instatiated 

        // we want the user to pick would they rather have a dawg or a kat 
        // but we dont know which one they are going to pick so why dont we do this 

        // so why dont we do this lets DECLARE an animale object but not INSTATIATE it 
        // we will assign our animale to a new dawg or a new Kat based on user input 
        Animale animale; 

        // it will either Animale animale = new Dawg(); or Kat depending on user input 

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Would you like a dawg or a kat. 1 = dawg, 2 = kat. : ");
        int choice = scanner.nextInt();

        // if our choice is equal to one we will finish instatiating our animal object 
        // we will assign it to be a new dawg object and  call the speak methpd 
        // if its a dawg itll woof 
        // and same for the Kat 
        if (choice == 1) {
            animale = new Dawg(); 
            animale.speak();
        }
        else if(choice == 2){
            animale = new Kat(); 
            animale.speak();
        }
        else{
            System.out.println("Invalid choice");
        }

        // before running the programme we dont know what kind of animale we are going to create it can be either dawg or kat. 
        // we declare the animale object not instatiate it 






        scanner.close();
    }
}