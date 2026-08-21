public class forLoops {

    public static void main(String[] args) {
        // for loops = execute some code a certain(limited) amount of times 

        // theres three statements in a for loop seperated with semi colon 
        // first statement is initilisation we can create a counter to see how many times we have iterateed this loop 

        // common practice is to create a counter called i for index. i is used a counter for this loop 
        // the second is the condition. When do we want to stop loop
       // the third statement is the step. we can increment our counter by one or another number  

       // initlisation, condition, update 
        for(int i = 0; i < 10; i++){
            System.out.println("pizza");
        }

        for(int i = 0; i < 10; i+=2){
            System.out.println(i);
        }

        // countdown simulator 

        int start = 10; 

        for(int i = start; i > 0; i--){
            System.out.println(i);
        }

    }
}