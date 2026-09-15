public class MyRunnable implements Runnable {
// MyRunnable is going to implement the Runnable interface. Implements because we are working with interfaces 
// if you are implementing an interface its kind of like signing a contract you have to override any required methids
// we have to override the run method


    // within this run method we are going to add any code we want to run in the background on a seperate thread
    // we are going to paste the loop from the java file into this run method 
    // when we call this run method we will have this countdwon timer in the background running on a seperate thread
    // any code you want to run in a seperate thread, place it within the run method 
    // now back to main java file
    @Override 
    public void run(){

        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000); 
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            // wheerver you would like to exit the programme prematurely write System.exit(0);
            if (i == 5) {
                System.out.println("Time's up");
                System.exit(0);
            }
            
        }

    }



    
}