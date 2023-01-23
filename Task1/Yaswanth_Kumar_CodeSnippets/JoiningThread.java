package threads;

public class JoiningThread extends Thread{
	public void run() {
		for(int i=1;i<=4;i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			System.out.println(e);	
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoiningThread t1=new JoiningThread();// Creating a thread
		JoiningThread t2=new JoiningThread();// Creating a thread
		JoiningThread t3=new JoiningThread();
		// thread t1 starts
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		try {
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t3.start();
		
		

	}

}
