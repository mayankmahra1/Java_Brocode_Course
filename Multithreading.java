public class Multithreading {
// NOTE THE MyRunnable2 JAVA FILE IS APART OF THIS LESSON 
public static void main(String[] args) {
    



        // Multi threading enables a programme to run threads concurrently(at the same time)
        // A thread as we know is a set of instructions that run independtly from other threads
        // Multithreading is useful for background tasks or time-consuming operations 
        // In the prior lesson we learned theres two ways to create threads
        // We can either extend the thread class or implement the runnable interface 
        // The second option is better in most cases because we are not limited to single inheritance 

        // start by creating a new class called MyRunnable2

        // lets create a MyRunnable2 object 
        MyRunnable2 myRunnable1 = new MyRunnable2(); 

        // we have to pass in this myRunnable2 object to a thread object 
        // first create thread object and pass in the myrunnable2 object
        Thread thread1 = new Thread(myRunnable1); 
        Thread thread2 = new Thread(myRunnable1); 


        // to get this thread to start we have to call the start method on it 
        // thread1.start();
        // thread2.start();

    

        // Another shortcut you can do instead of creating a name runnable object, you can pass in an anonymous 
        // runnable object to the thread constructor like this  
        // this works too and is a lot mroe concise
        // Thread thread = new Thread(new MyRunnable2()); 

        // now we won't have just one thread we'll have two so lets rename accordingly 
        // so lets create another one back up the top
        // now we have to threads running at the same tine (concurrently)

        // we have succesfully multithreaded
        // we could diffetntiate these by getting there name
        // go back to MyRunnable2 class 
        // now they won't always been in the same order they are running independently

        // Heres an excerise we are go to have thread 3 say ping and thread 4 say pong 
        // we will create a new my runnable class and some new thread
        // now we have to pass in some text as argument when we create a runnable object 
        Thread thread3 = new Thread(new MyRunnable3("Ping")); 
        Thread thread4 = new Thread(new MyRunnable3("Pong")); 

        // before we start the thread lets have a print statement 
        System.out.println("GAME START!");

        
        thread3.start();
        thread4.start();

        // we do have to suurond these with try and catch blocks
        try{
            thread3.join();
            thread4.join();
        }
        catch(InterruptedException e){
            System.out.println("Main Thread was interrupted");
        }



        // the problem is our main thread finishes before our thread1 and thread2 finish 
        // we can have our main thread wait for these threads to finsih by calling the join method of each thread
        // now our main thread will wait till thread3 and 4 have finished and then print game over
        // so main thread pauses essnetiially once thread.join is ran
        System.out.println("GAME OVER!");

    }
    
}