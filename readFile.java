import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {

    public static void main(String[] args) {
        // after doing research there is three popular options 
    
        // the first and what we will demonstarte in this video is to combine a bufferedReader and a FileReader both together 
        // This technique is best for reading text files line by line 
        // BufferedReader cannot read a file by itself. You can say it acts as a middle man between the programme and file system 
        // It helps us read files more efficently and file reader actually reads the file. 
        // we'll be using both of these together 

        // FileInputStream = is best for binary files e.g: images and audio files 
        // RandomAccessFile = best for reading and writing specfic portions of a large file 

        // we need a file to work with so lets create a file called test2 on our desktop 
        // we will need the name of the file, the file extension, and where its located 

        String filePath = "/Users/mayankmahra/Desktop/test2.txt"; 
        
        // first we will create a BufferedReader object 
        // we will need to import the class
        // we cannot create a BufferedReader without first passing in a reader object 
        // which is why we will be combining this with a FileReader object 
        // within the constrcutor we will be passing in  a object
        // and we do need to import the FileReader also 
        // within the constructor of our filereader we are going to pass in our filePath 
        // when reading and files youll need try and catch blocks 
        // we are already  getting a warning here
        // when working with files its dangeorus code becasue you dont know if youll actually locate that file or not 
        // Or reading or writing that file might be unsuccesful for some reason 
        // BufferedReader reader = new BufferedReader(new FileReader(filePath)); 

        
        // we will use a try and catch block 
        // try this dangeorus code. catch any exceptions 
        // in moderen java u can use with resources
        // when using try with resources you automatically close the reader when youre done with it 
        // by hovering over FileReader we can see we are going to catch any FileNotFoundExceptions within the catch block
        // and we need to import this class also 
        // to catch all input output exceptions we'll add another safety block which will act as an exception 
        // now when we test it we can see that that file exists 
        // now if we purposefully mispell we get could not locate
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            System.out.println("That file exists");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate");
        }
        catch(IOException e){
            System.out.println("Something went wring");
        }


        // now to actually read the file within the try block lets cretae a local var called line 
        // we'll be reading our file line by line
        // since we are reading it line by line we'll be using a while loop 
        // During each cycle of the while loop we are going to write the following within the paranthesis 
        // we are to set our string of line to be equal to our buffered reader object reader
        // we are taking our reader and reading the current line. this will return a string which we were assignin to the string 
        // variable line 
        // after reading one line our reader is going to point to the next line however if we run out of lines the readLine mthd 
        // is going to return null 
        // so we are going to cointune reading lines until line != a value of null
        // use the reader read each line assign it to line. if we run out of lines ie line == null we'll escape the while loop
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line; 
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate");
        }
        catch(IOException e){
            System.out.println("Something went wring");
        }

    }
}