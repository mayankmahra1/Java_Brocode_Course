public class Aggregation {

// NOTE THE BOOK and LIBRARY JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {

        // Aggregation represents a "has a" relationship between objects
        // one object contains another object as a part of its structure
        // but the contained object/s can exist independtly 
        // basically speaking an object can contain another object. but them objects can exist independtly 


        // what we will do in this demo is create some book objects 
        // then we'll contain a library object to contain them book objects 
        // the books and the library can exist indepently, thats aggregation 
        // the libray object will "have" book objects 


        // lets create a few book obejcts now that weve made the book class 
        Book book1 = new Book("Harry Potter", 300); 
        Book book2 = new Book("Diary of wimpy kid", 150);
        Book book3 = new Book("42 Laws of Power", 350); 


        // lets stick all these book objects within an array 
        Book[] books = {book1, book2, book3}; 

        
        // lets test the display info method for all thse books 
        System.out.println(book1.displayInfo());
        System.out.println(book2.displayInfo());
        System.out.println(book3.displayInfo()); 
        System.out.println();


        // we can also print by looping through the array using an enhance for loop 
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
        System.out.println();


        // now lets create our library class and objects 
        

        // now this is where aggregation is going to come in 
        // we will create a library object 
        // but we have to pass in the following args. Name for the library, year for the library and also 
        // an array of Book objects 
        // this is aggregation. our library object has book objects 
        Library library = new Library("Whitechurch Library", 1980, books); 


        // lets also create a display info method within the library class
        library.displayInfo();


        // with aggregation if i delte the library class. well these book objects can exist indepently outside of the library 
        // the books arent built into the library so they can exist indepently 
        // which is key difference compared to composition which is the next topic we will go through 

 



        
    }
}