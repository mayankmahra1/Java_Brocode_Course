import java.util.Arrays;

public class stringMethods {

    public static void main(String[] args) {
        
        String name = "Mayank Mahra"; 
        String name2 = "Mayank Mahra";
        String estate = "    Whitechurch    "; 

        int length = name.length(); 
        System.out.println(length);

        String upperCaseName = name.toUpperCase(); 
        System.out.println(upperCaseName);

        String lowerCaseName = name.toLowerCase(); 
        System.out.println(lowerCaseName);

        char letter = name.charAt(4);
        System.out.println(letter);

        int index = name.indexOf("n"); // what index if first occurence of n in string name 
        System.out.println(index);

        int lastIndex = name.lastIndexOf("M"); // what is the index of the last occurence of M 
        System.out.println(lastIndex); 

        // we can trim any whitespaces before and after a string 
        String estateTrimed = estate.trim();
        System.out.println(estateTrimed);


        // we can replace occurence of a character with another
        String nameWithoutM = name.replace("M", "N");
        System.out.println(nameWithoutM);

        boolean isEmpty = name.isEmpty(); 
        System.out.println(isEmpty);

        boolean contains = name.contains("M"); 
        System.out.println(contains);


        // checking to see if two strings equal 

        // equals does not account for case sensitivity
        boolean nameMatches2 = name.equals("Mayank Mahra"); 
        System.out.println(nameMatches2);

        boolean nameMatches3 = name.equalsIgnoreCase("mayank mahra");
        System.out.println(nameMatches3);

        // turn a string into an array of characters 
        char[] nameCharArray = name.toLowerCase().toCharArray(); 

        for(char a : nameCharArray){
            System.out.print(a + " "); 

        }

        System.out.println();
        Arrays.sort(nameCharArray);

        for(char a : nameCharArray){
            System.out.print(a + " "); 

        }

        System.out.println();
        System.out.println(Arrays.equals(nameCharArray, nameCharArray));













    }
}