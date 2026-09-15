public class MyRunnable2 implements Runnable {
    // MyRunnable2 will implement the runnable interface

    // if we are implementing an interface its kind of like we are signing a contract
    // we have to override any required methods ie the run method 
    // whatever code is in the run method this is the code thats gonnna run when this thread is up and running 
    // lets count to 5 using a for loop 
    // Access the thread call and call the sleep method and pass in args a milliseconds
    // it needs to be surronded by a try and catch block because its consedired dangerous code
    @Override 
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i); // this is how u get the name
            }
            catch(InterruptedException e){
                System.out.println("Thread was Interrupted");
            }
            
            
        }
    }

    
}