public class breakContinue {

    public static void main(String[] args) {
        
        // 2 important keywords when it comes to loops is break and continue 

        // break = is used to break out of a loop (STOP)
        // continue = skips the current iteration of a loop (SKIP )


        // lets say when we reach 5 i wanna break out of the loop
        // then when i == 5 we break out the loop entirely 
        for(int i = 0; i < 10; i++){

            if (i == 5) {
                break;
            }

            System.out.print(i + " ");

        }

        System.out.println(" ");

        // now lets say we want to print everything except 5 
        // for continue we dont break out of the loop we just skip the current iteration 
        for(int i = 0; i < 10; i++){

            if (i == 5) {
                continue;
            }

            System.out.print(i + " ");

        }






    }
}