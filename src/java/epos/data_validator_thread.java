/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epos;

/**
 *
 * @author ani
 */
public class data_validator_thread implements Runnable{
    

   private Thread t;
   private String threadName;

    public data_validator_thread( String threadName, int x)
    {
        
        this.threadName = threadName;
        this.x = x;
    }
   int x;
   
 
   @Override
   public void run() {
       try
       {
       for(int i=0;i<x;i++)
           System.out.println(threadName+":"+i+"\n");
       Thread.sleep(50);
        }
       catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
       }
  }
   
   public void start ()
   {
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }


   public static void main(String args[]) {
   
      data_validator_thread R1 = new data_validator_thread("Thread-1",5);
      R1.start();
      
      data_validator_thread R2 = new data_validator_thread("Thread-2",6);
      R2.start();
   }   
}