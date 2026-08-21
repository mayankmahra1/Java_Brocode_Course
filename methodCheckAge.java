public class methodCheckAge {

    public static void main(String[] args) {
        
        int age = 17; 

        if(checkAge(age)){
            System.out.println("Your an adult, proceed");
        }
        else{
            System.out.println("Go home kiddo!");
        }



    }

    static boolean checkAge(int age){

        if(age >= 18){
            return true; 
        }
        else{
            return false; 
        }
    }


    // it can be condesned even further to this 
    // its easier to read the other but its good to know this especially for interviews 
    
    /*static boolean checkAge(int age){

        return age >= 18; 
    } */
}