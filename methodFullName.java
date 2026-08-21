
public class methodFullName {

    public static void main(String[] args) {
        
        String firstName = "Mayank"; 
        String lastName = "Mahra"; 

        String govtName = fullName(firstName, lastName); 
        String spyName = fullName("Yusei", "Fudo");
        System.out.println(govtName);
        System.out.println(spyName);
    }


    static String fullName(String firstName, String lastName){
        return firstName + " " + lastName; 
    }
    



}