package threads;

//implement thread using runnable interface
class Example3 implements Runnable
{
      String message;
      Example3(String msg)
      {
            message = msg;
      }
      public void run()
      {
            for(int count=0;count<=4;count++)
            {
                  try
                  {
                        System.out.println("Run method: " + message);
                        Thread.sleep(100);
                  }
                  catch (InterruptedException ie)
                  {
                        System.out.println("Exception in thread: "+ie.getMessage());
                  }
            }
      }
}
 class MainThread
{
      public static void main(String[] args)
      {
    	  Example3 obj1 = new Example3("MyThread obj1");
    	  Example3 obj2 = new Example3("MyThread obj2");
             Thread t1 = new Thread(obj1);
             Thread t2 = new Thread(obj2);
             t1.start();
             t2.start();
      }
}
