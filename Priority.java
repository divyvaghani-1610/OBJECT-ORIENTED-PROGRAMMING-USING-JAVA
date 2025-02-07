class Priority extends Thread
{
	public void run()
	{
		//j.setPriority();
		System.out.println(getPriority());
	}
	public static void main(String args[])
	{
		Priority j= new Priority();
		j.start();
		j.setPriority(3);
	}
}