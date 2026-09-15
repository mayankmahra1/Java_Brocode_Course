import java.util.Timer;
import java.util.TimerTask;

public class Timer_Task {
    public static void main(String[] args) {
        
        // Timer is a class that schedules tasks at specific times or periodcially 
        // Timer is useful for: sending notifications, scheduled updates or reptitive actions
        // When u need to schedule a task at a specific time you can use a timer class
        
        // Timertask is that task that's going to execute when our timer says so 
        // In order to use TimerTask you are going to extend the TimerTask class and then define your task. And we are
        // going to be doing this using anonymous classes 
        // Create a subclass of TimerTask and @Override run() 

        // we'll begin by creating a timer. And we need a timer well to keep track of time. 
        // create a timer object and import the Timer class.
        Timer timer = new Timer();
        

        // than we need a TimerTask. What are we gonna do when the timer is up. 
        // Create a new TimerTask object andn import the class. 
        // so we have a error and here's the situation. 
        // With our timer class we have to implement the run method. To override the run method we could create a child class
        // from the TimerTask class. 
        // But a better option is to create a anonymous class. 
        // Remember anonymous class after the paranthesis/constructor and curly braces
        // Within this anonymous class we can update and change the behaviour of our TimerTask object 
        // What we will do is override the run method. To override this method it will be public void run
        // When we execute our task what would we like to do. 
        // so our task is to print hello. But we have to do it when our timeer says so. 
        // so our task and our timer work together
        TimerTask task = new TimerTask(){

            int count = 3; 


            @Override 
            public void run(){
                System.out.println("Hello");
                count --; 
                
                if(count <= 0){
                    System.out.println("task complete");
                    timer.cancel();
                }
            }
        }; 


        // lets say I would like to say hello after three seconds. 
        // to do that we are going to take our timer object and call the schedule method and pass in arguments 
        // which is the task and delay in milli secojnds
        // after a delay of 3 seconds do the task
        // timer.schedule(task, 3000);
        // System.out.println();

        // you can also scheudle at a fixed rate or perodically 
        // so lets create repeat our task of saying hello more than once 
        // the third argument is the period: what is the delay in milliseconds between repetitions 
        // starting immdeitaley print hello every 1000 milliseconds
        timer.schedule(task, 0, 1000);

        // how do you cancel a timer once its started. WELL u can use the cancel method 
        // Where can we add that. Well within our task. 
        // We will need some sort of stopping condition kind of like a while loop
        // lets say I would like to say hello 3 times.
        // go back up to the anonymous class and look at the chnages.  

    }
}