public class methodToCube {

    public static void main(String[] args) {
        
        double numToBeCubed = 4; 

        double answer = cubed(numToBeCubed);
        
        System.out.println(answer);

    }

    // static because the main method from which we are calling this method is static 
    // no void because we a returning something 
    // // double becasue thats what we are returning 
    // the parameter is of type double  
    // so when calling this method in the main method the arguments you pass can only be one of type double 
    static double cubed(double numToBeCubed){
        return numToBeCubed * numToBeCubed * numToBeCubed;
    }
}