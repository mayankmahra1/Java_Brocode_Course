public class printF {

 public static void main(String[] args) {
    
    // printf() = is a method in java used to format output 
    // its an alt to print and println

    // %[flags][width][.precision][specifier-character] 
    // whereever we would like to insert a variable we can add a placeholder of a percent sign than add one of a few characters 
    // following it to format the output 

    String name = "Spongebob"; 
    char firstLetter = 'S';
    int age = 30; 
    double height = 60.5; 
    boolean isEmployed = true; 

    // we have vars which we can insert into prinf statments 

    System.out.printf("Hello %s\n", name);
    //we want insert name into this print f statement. so we use placeholder which is percent symbol followed by lowercase s for string
    // the lowercase s is the specifier character. what is the data type of var we are trying to insert
    // instead of + variable name we do , varname  


    // to insert a character 
    System.out.printf("The first character of your name is: %c\n", firstLetter);
    // we want to insert a variable so % the datatype of the var of which is the first letter in lowercase and than , the var name 


    // to insert a integer 
    // unfortunaltey for integer its lowercase d in print f statements idk why maybe think of digits 
    System.out.printf("You are %d years old\n", age);  

    // to insert a double 
    // here its %f for double think float i guess
    System.out.printf("Your height is %f inches tall\n", height); // we can limit amount of digits by setting a precision

    // to insert a boolean 
    System.out.printf("Employed %b\n", isEmployed);

    System.out.printf("Hello %s. The first letter of your name is %c. You are %d years old. Your height is %f inches tall. Employed: %b\n", name, firstLetter, age, height, isEmployed);



    
    // by setting precision we can limit the amount of digits that display after a decimal 
    double price1 = 90000.99; 
    double price2 = 1000000.15; 
    double price3 = -5400.01; 

    // when using print f it normal displays 6 digits after the decimal point 
    System.out.printf("The price is %.1f\n",price1); // to display 1 digit after decimal point
    System.out.printf("The price is %.1f\n",price2);
    System.out.printf("The price is %.1f\n",price3);
    // this will automatically round the output 

    System.out.printf("The price is %.3f\n",price1); // to display 3 digit after decimal point
    System.out.printf("The price is %.3f\n",price2);
    System.out.printf("The price is %.3f\n",price3);
 

    // next we have flags
    // flags go after placeholder or percent sign
    // heres differnet flags we can add 
    

    // + = output a plus for positive numbers
    // , = comma grouping seperator  for thousndads
    // ( = negative numbers are enclosed in brackets 
    // space = display a minus if negative and a space if positve its for a alignment 

    // by adding a plus after the percent sign(placeholder) we can output a plus for postive number
    System.out.printf("The price is %+.2f\n",price1); 
    System.out.printf("The price is %+.2f\n",price2);
    System.out.printf("The price is %+.2f\n",price3);



    // adds commas for thousands 
    System.out.printf("The price is %,.2f\n",price1); 
    System.out.printf("The price is %,.2f\n",price2);
    System.out.printf("The price is %,.2f\n",price3);

    // adds ( single paranthesis any negative number 
    System.out.printf("The price is %(.2f\n",price1); 
    System.out.printf("The price is %(.2f\n",price2);
    System.out.printf("The price is %(.2f\n",price3);
 
    // add space next to placeholder which adds minus if negative and space if positive
    System.out.printf("The price is % .2f\n",price1); 
    System.out.printf("The price is % .2f\n",price2);
    System.out.printf("The price is % .2f\n",price3);


    // last specifier is width 
    // 0 = zero padding 
    // postive number = right justified padding
    // negative number = left justified padding 


  // these numbers have a varying number of digits
    // by setting the width we can align them 
    int id1 = 1;
    int id2 = 23; 
    int id3 = 456; 
    int id4 = 7890; 
  



    // we zero pad these numbers by 4 digits 
    //to zero pad follow our placeholder with zero and then how many numbers or didgits u wanna zero pad by 
    System.out.printf("%04d\n", id1);
    System.out.printf("%04d\n", id2);
    System.out.printf("%04d\n", id3);
    System.out.printf("%04d\n", id4);


// rather than zero pad there is just spaces.   
// right justified
    System.out.printf("%4d\n", id1);
    System.out.printf("%4d\n", id2);
    System.out.printf("%4d\n", id3);
    System.out.printf("%4d\n", id4);

    // left justified
    // rather than zero pad there is just spaces.   
    System.out.printf("%-4d\n", id1);
    System.out.printf("%-4d\n", id2);
    System.out.printf("%-4d\n", id3);
    System.out.printf("%-4d\n", id4);


















 }
}