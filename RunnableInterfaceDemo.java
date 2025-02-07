class RunnableInterfaceDemo implements Runnable
{
  public void run()
  {try{
	  for(int i=1; i<=10; i++)
	  {   
		  System.out.println("Thread Run:" +i);
		  Thread.sleep(1000);
    }}
	catch(Exception e){}
  }
  
  public static void main(String args[])
  { 
    RunnableInterfaceDemo t1 = new RunnableInterfaceDemo();
    Thread d1 = new Thread(t1);
	d1.start();
	System.out.println(d1.currentThread());
	d1.setName("Divy");
	System.out.println(d1.currentThread());
  }


}