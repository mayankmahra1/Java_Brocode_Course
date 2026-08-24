public class Book {

    // lets design our book objects 
    String title; 
    int pages; 

    // set up a consrcutor for our book object 
    // if you would like you can set these attributes to be private but thats overkill for this lesson 
    Book(String title, int pages){
        this.title = title; 
        this.pages = pages; 
    }

    // why dont we create a method to display the books info 
    // this method will return a string 
    String displayInfo(){
        return this.title + " " + this.pages + " Pages"; 
    }

    
}