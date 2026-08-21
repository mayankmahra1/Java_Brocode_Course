public class nestedIfs {

    public static void main(String[] args) {

        boolean isStudent = true; 
        boolean isSenior = true; 
        double price = 9.99; 

        if(isStudent){
            if(isSenior){
                System.out.println("You get both Student & Senior Discount worth 30%");
                price *= 0.7;
            }
            else{
                System.out.println("You get Studet discount worth 10%");
                price *= 0.9;
            }
        }
        else{
            if (isSenior) {
                System.out.println("You get Senior Discount worth 20%");
                price *= 0.8;
            }
        }

        System.out.printf("Your final price is: %.2f\n", price);


        









    }
}