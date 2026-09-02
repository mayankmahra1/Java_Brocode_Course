import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.IIOException;

public class writeFiles {

    public static void main(String[] args) {

        String filePath = "/Users/mayankmahra/Desktop/test.txt"; 
        String textContent = """
                Yo I like pizza
                its pretty good 
                but high calorie
                """;


        // how to write a file using java of which there are 4 popular options 

        // FileWriter is the most simple. We'll be using a FileWriter Object. Its good for writing small or medium sized text files
        // Theres also a buffered writer which has better performance for large amounts of text 
        // PrintWriter is best for structured data like reports or logs 
        // Then there is FileOutputStream which is best for binary files such as images and audio files 

        // in this topic we will cover FileWriter just so we get the hang of the basics 


        // Heres how we can write a basic file using java
        // we'll need a FileWriter object 
        // once we create the object we need to pass in a file path or a file name 
        // lets create a file called test and include a file extension lets say txt file(a plain text file )
        // now you could include a absolute file path but we'll show you how to do that later 
        // our plain text file of test is now going to appear in our source(src) folder
        // reading or writing files is kind of unpredictable and you could consider that dangerous code
        // FileWriter writer = new FileWriter("test.txt"); 

        // and remember any dangerous code we want to include in a try block
        // in modern java you can try and open up some resource. add a set of paranthesis after try
        // we will try to open up the FileWriter object 
        // we do have to import the FileWriter class 
        // if for some reason we can't write this file we might encounter an exception 
        // we will catch any IOExceptions 
        // IO meaning input output 
        // catch any IOExcepytions thats the type and we will give this exception a nickname of e
        // we have to import this class too in order to work with IOExceptions 
        // now if theres a problem writing this file we'll catch this exception if it comes up 
        // remember its best practice to handle specific kind of Exceptions first 
        // Momentartliy we are going to add a catch clause for a file not found exception incase we cannot locate a filepath
        // within the try block in order to write a file in java using FileWriter, we'll take our FileWriter which we named
        // writer and call the write method and then pass in a string 
        // then after writing the file if we dont encounter any excpetions. We'll print a confirmation message 
        // now lets test this. in our debug output we have file has been written 
        // since we didnt specify a file path the file is likely going to be in the src folder which it is 
        // you could pick a diffrent location. eg you could use an absolute file path 
        // lets say i would like to write this file to my desktop 
        // youll need to use double downward slashes because java interprets single as escape sequence
        // but mac is diffrent u just use 1 upward slash 
        // when a write this file it should be at this location 
        // now when we go to our desktop we can see that file 
        // if we change the file location and mispell it then we get the error 
        // remember its best to catch specific types of exceptions first 
        // here we are relying purely on our safety net which catches IOExceptions 
        // another kind of exception we can catch is the FileNotFoundException which we can give the nickname e
        // remember we gotta import it 
        // this is if we can't locate a file or a file path is invalid  
        // now if  we try that with our mispelt file path we get the print statement could not locate file location
        // for better organisation you can create a string of file path 
        // then copy everythign you pass in as arguments in the filewriter and store it in the string of filepath
        // then we'll pass in the string variable to the fileWriter 
        // and the same instead of passing a literal string into the write method we can create a string called textContent
        // if you have a string which takes up multiple lines. Another option is to write a multi line string using  
        // by using a triple set of double quotes
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent); 
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate File Location");
        }
        catch(IOException e){
            System.out.println("Could not Write file");
        }


        
    }
}