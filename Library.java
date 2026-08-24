public class Library {

    // what should libraries have 
    // maybe a name, a year of establishment and libraries should cotnain book obects 
    // we will create an array of Book objects called books. this is the books the library has  
    String name; 
    int year; 
    Book[] books; 

    // we'll need a constructor for the library class 
    Library(String name, int year, Book[] books){
        this.name = name; 
        this.year = year; 
        this.books = books; 
    }

    // we will make it a little different. this method wont return anything. 
    // lets also list all the books it has. this library has aggregated a whole bunch of book objects 
    // so  we can display them our use them for something 
    // for every book object in my array of books call the displayInfo method from the Book class 
    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books avaliable: ");
        for(Book book : this.books){
            System.out.println(book.displayInfo());
        }
    }



}