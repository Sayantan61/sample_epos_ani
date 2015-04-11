public class sample_runnable implements Runnable {
   private Thread t;
   private String sample_runnableName;
   
   sample_runnable( String name){
       sample_runnableName = name;
       System.out.println("Creating " +  sample_runnableName );
   }
   public void run() {
      System.out.println("Running " +  sample_runnableName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + sample_runnableName + ", " + i);
            // Let the sample_runnable sleep for a while.
            Thread.sleep(50);
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  sample_runnableName + " interrupted.");
     }
     System.out.println("Thread " +  sample_runnableName + " exiting.");
   }
   
   public void start ()
   {
      System.out.println("Starting " +  sample_runnableName );
      if (t == null)
      {
         t = new Thread (this, sample_runnableName);
         t.start ();
      }
   }

}

/*public class sample_runnable {
   public static void main(String args[]) {
   
      sample_runnable R1 = new sample_runnable( "Thread-1");
      R1.start();
      
      sample_runnable R2 = new sample_runnable( "Thread-2");
      R2.start();
   }   
*/
