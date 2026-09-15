import java.util.Scanner;
 // NOTE THE myrunnable JAVA FILE IS APART OF THIS LESSON 

public class Threading {

    public static void main(String[] args) {

        // Threading allows a programme to run multiple tasks simulatenosly 
        // It helps improve performance with time consuming operations such as 
        // File I/O, network communications or any background tasks 
        // Any code that is considered time consuming we can have it run on another thread 
        // so that it doesn't inconvenience our main programme. 

        // 2 options to create a thread
        // Option 1 is to extend the thread class. Its the simpler option but its limited 
        // Option 2 is to implement the runnable interface. This option tends to be bette because by extending the 
        // thread class we are limited to single inheritance but by implementing the runnable interface thats a way around that

        // We are only going to show option 2 its better with more possibilities


        // In this programme we are about to write lets say its quiz or a game. 
        // A user has 10s to respond and if they do not times up 
        // Currently we have one thread, we are running our prgoramme on what is known as the main thread. 
        // Witout using any other threads besides the main thread i might right my prgramme as follows 

        Scanner scanner = new Scanner(System.in); 



        // we are goign to let a user know they have 5 seconds to enter there name 
        // Lets create some sort of timer now that we have the foundation 

        // during each cycle of the for loop to mimic waiting for one second you can access the thread class call the
        // sleep method and pass in a value as milliseconds
        // When u use thread that refers to the current thread we are working with in this case the main thread which is 
        // what are main programme runs on. 
        // But since our thread may be interrupted we need a try and catch block. because this is considered dangerous code
        // we will catch the following exception to which we give the nickname e 
        // also in our imaginary timer we will need an exit condition 
        // The probelm now is all of the code is running on our main thread
        // We have 5 seconds to enter our name but we can't reach that code till the 5 seonds is up
        // so what we could do is create a seprate thread where we are counting to 5 and our main thread is going to be
        // incharge of acceptig the user input. 
        // so to create another we are going to extend the runnable interface to create a runnable object
        // lets go to the myRunnable class 

    /*    
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000); 
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if (i == 5) {
                System.out.println("Time's up");
            }
            
        }

    */    

        // we now have our class of MyRunnable so lets create a MyRunnable object
        MyRunnable myRunnable = new MyRunnable();

        // we will take this myRunnable object and pass it into the constructor of the thread class
        // Heres where we are going to create a new thread object and pass in our myrunnable object
        Thread thread = new Thread(myRunnable); 

        // now we just need to start our thread
        thread.setDaemon(true);
        thread.start();

        // both these threads are running at the same time 
        // the code within the run method is running on a seperate thread in the background while our main 
        // thread is running
        // our programme does not exit until all threads are done
        // if your main thread is done you can end all other threads but you will want to set your threads to what
        // is known as daemon threads. 
        // a daemon thread will end when the main thread is over 
        // now this thread is going to end as soon as our main thread is finisged
        // you see how times up isnt printed now. Thats because the thread ended as soon as our main thread ended
        // but if you dont type in anything it will continue to run until u enter a name
        // so if u want your programme to exit go to the MyRunnable class
        // now if you dont type a name and the 5 seconds are up the all threads close. 
        

        System.out.println("You have 5 seconds to enter your name");
        System.out.print("Enter your name ");
        String name = scanner.nextLine(); 
        System.out.println("Hello " + name);

    








        scanner.close();
    }
}