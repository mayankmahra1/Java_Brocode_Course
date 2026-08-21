
public class wrapperClasses {

    public static void main(String[] args) {
        
        // wrapper classes = allow primitive values (int, char, boolean, double) to be used as objects. "Wrap them in a object"
        // genereally you dont wrap primitives unless you need an object 
        // allows the use of collection framework and static utility methods 

        // this method of creating wrapper classes is actual depreiciated buts its going to help visulaise how this works
        // wrapping a primitive within an object 
        // autoboxing is the modern technique but this is for visulisation 

        // int a = 123; // we can treat this primitive as an object using the wrapper class 

        // a is an object we are passing in the primitive data type i.e the int as an argument to the integer class


        // these are all objs a,b,c,d
        // by wrapping this primitves within a objects that allows us to use these primitve values within collection frameworks 
        // such as arraylists 

      /*  Integer a = new Integer(123); 
        Double b = new Double(3.14); 
        Character c = new Character('$');
        Boolean d = new Boolean(true);  */

        // The modern way to use wrapper classes is just to assign them to their primitive values
        // autoboxing
        // these are all refernce datatypes. they are a type of obj
        Integer a = 123;
        Double b = 3.14; 
        Character c = '$'; 
        Boolean d = true; 
        String e = "pizza";        // this is very similar to how declare and assign strings


        //UNboxing
        // also a technique called unboxing to convert a wrapper class back to its primitive 
        // taking a primitive and unboxing it 
        int x = a; 
        double y = b; 
        char z = c; 


        // wrapper classes have pretty useful utility methods that are static 
        // heres a few but theres a lot 


        // if you ever need to convert a primitive data type into a string there is a toString method of these utility classes 
        // i can convert an integer into a string using the integer wrapper class 
        // its accessed statically so we type the name of the class Integer call the .toString() which is static 
        // and then pass in a integer 
        // if you ever need to convert a primitive to a string then use that primitive data types wrapper class 
        // and all the toString method then you just need to pass a value in as an argument and then it will spit out a string 
        String aa = Integer.toString(123); 
        String bb = Double.toString(3.14); 
        String cc = Character.toString('$');
        String dd = Boolean.toString(false);

        // strings can be concatenated so if everything is done write this shoild work 
        String xx = aa + bb + cc + dd;
        System.out.println(xx);



        // on the other hand to convert a string to a primitve data type 
        // theres any useful utility method of wrapper classes 
        // what we will do is parsing 

        int aaa = Integer.parseInt("123"); // convert a string of 123 to an inteer
        double bbb = Double.parseDouble("3.14"); // convert a string of 3.14 to an double 
        // character dont have a parse method but what you can do instead is with any string: lets say we have a string of pizza
        // strings do have built in methods like the .charAt() method  which is unrelated to wrapper classes
        char ccc = "pizza".charAt(0);
        boolean ddd = Boolean.parseBoolean("true"); 

       // String xxx = aaa + bbb + ccc + ddd; // does not work now see\



       // couple of other miscellanous methods utility methods within wrapper classes 


       char letter = 'M';

       // we can check if our char is actually a letter and it will return a boolean 
       // this would be good to verify user input 
       System.out.println(Character.isLetter(letter));

       // also a built in method to see if our letter or char is uppercase or not
       // again great for user input 
       System.out.println(Character.isUpperCase(letter));


       // next topic we are going to be working wiht arraylists and arraylists only work with objects 
       // so we need to use wrapper classes in order to work with arraylists. 



        
    












    }
    
}
