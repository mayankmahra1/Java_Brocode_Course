public class MyRunnable3 implements Runnable {
    // The Myrunnable3 class implements the runnable interface
    // implementing is like signing a contract where yiy have to override any required methods in this case
    // the run method 

    // we will need some text a text var
    private final String text; 

    // we will need a constructor to assign it 
    MyRunnable3(String text){
        this.text = text; 
    }



    // in this case we will print the text
    public void run(){

        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(text);
            }
            catch(InterruptedException e){
                System.out.println("Thread was Interrupted");
            }
        }

    }

    
}