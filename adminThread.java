class adminThread extends Thread {
   adminThread() {
      setDaemon(false);
   }
   public void run() {
      boolean d = isDaemon();
      System.out.println("daemon = " + d);
   }

   public static void main(String[] args) throws Exception {
      Thread thread = new adminThread();
	  thread.setName("Divy");
      System.out.println("thread = " + thread.currentThread());
      //thread.setDaemon(false);
      thread.start();
   }
}