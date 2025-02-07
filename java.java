class Priority extends Thread
{
	public void run()
	{
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}
	public static void main(String args[])
	{
		java j= new java();
		j.start();
	}
}