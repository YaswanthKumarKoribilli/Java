package threads;

class Example4 extends Thread {
    private volatile boolean stop_flag = true;      //initially set to true
    public void stopRunning() {
        stop_flag = false;          //set stop_flag to false
    }
    @Override
    public void run() {
        while (stop_flag) {         //keep checking value of stop_flag 
            System.out.println("Thread is running...");
        }
     System.out.println("Thread stopped!!!");
    }
}
  
 class Main {   
    public static void main(String[] args) {
        //create a thread instance
    	Example4 stop_thread = new Example4();
        //start the thread         
        stop_thread.start();
        try {
            Thread.sleep(5);
        } 
        catch (InterruptedException e)   {
            e.printStackTrace();
        }
          
        //call stopRunning() method to stop the thread
         stop_thread.stopRunning();
    }   
}
