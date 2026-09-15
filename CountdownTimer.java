import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Going to create a countdown Timer mini project. 
        // This is to get used to working with Timer classes and TimerTask classes 

        // Create a timer object and import the class
        Timer timer = new Timer();

        // Create a TimerTask object and import the class
        // Remember you create a Task by extending the TimerTask and overriding its run method 
        // and you override the run method using anonymous classes 
        // The long way is to create a class and inherit from the TimerTask class and then override the run method 
        // But this new class would only be used once and not repeatdly so: 
        // so for simplicity for our TimerTask object we have to override the run method and we do that using
        // anonymous classes 
        System.out.print("Enter # of seconds to count down from ");
        int response = scanner.nextInt();


        TimerTask task = new TimerTask(){

            int startTime = response;

            @Override 
            public void run(){

                System.out.println(startTime);
                startTime--; 

                if (startTime == 0) {
                    System.out.println("Happy New Year");
                    timer.cancel();
                }

            }
        }; 

        // call the schedule method on the timer object.
        // pass in the TimerTask the start delay and timebetween repetitions 
        // we could use these but theres a better way
        // timer.schedule(task, 0, 1000);

        // its the exact same as before just a different name
        timer.scheduleAtFixedRate(task, 0, 1000);
        
        scanner.close();
        
    }
}