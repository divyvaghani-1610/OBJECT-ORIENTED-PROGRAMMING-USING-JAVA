class CounterThread implements Runnable
{
	Thread t;
	CounterThread()
	{
		t= new Thread(this,"Thread Example");
		System.out.println("Detail of child tread"+t);
		t.start();
	}
	public void run()
	{
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println("Child:"+(i+1));
				Tread.sleep(500);
			}
		}
		catch(Exeption e)
		{
			System.out.println("Child tread interrupted");
		}
		System.out.println("Exit from Child tread");
	}
	public static void main(String args[])
	{
		new CounterThread();
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main:"+(i+1));
				Tread.sleep(1000);
			}
		}
		catch(Exeption e)
		{
			System.out.println("Main tread interrupted");
		}
		System.out.println("Exit from Main tread");
	}
}