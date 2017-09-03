
public class Threads {

   
    public static void main(String[] args) 
    {
       /*     Create an Anonymous Class Thread that prints a specific letter (plus the name of the Thread and how many times)
        Threads run in parallel in both cases (3 Thread for each case)
        
        
        Remarks:
        In the first case there is no time lag, so we see very few changes
        In the second case due to the time delay (0.5sec) there are many alternatives and in some cases not synchronized and the output is not binding
        and apparently, the difference is obvious
        
        Also when compiling the program we have a 6 + 1 class file because a thread is an independent run in the program code
        So we have 6 class file (3 + 3 thread-based exercises running in parallel) and 1 class file related to the process of the program

        
        
        
        

        
*/
        
        
        
        
            
            Thread a = new Thread()   
            {
                public void run()
                 {
                     for(int i=0;i<100;i++)
                     {
                         
                         System.out.println(Thread.currentThread().getName()+":     A"+"    times:"+i);

                     }
                 }
            };
            
            
            
            Thread b = new Thread()   
          {
            public void run()
            {
                for(int i=0;i<100;i++)
                {
                    System.out.println(Thread.currentThread().getName()+":      B"+"    times:"+i);
                }
            }
         };
         
         
         
         
         
          Thread c = new Thread()   
        {
            public void run()
            {
                for(int i=0;i<100;i++)
                {
                    
                    System.out.println(Thread.currentThread().getName()+":      C"+"    times:"+i);
                }
            }
        };
       
       
       a.start();
       b.start();
       c.start();
       
       
       
       
       
       Thread a1 = new Thread()   
        {
            public void run()
            {
                for(int i=0;i<20;i++)
                {
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e)
                    {

                    }

                    System.out.println(Thread.currentThread().getName()+":      A"+"    times:"+i);
                }
            }
        };
        
        
        
        
        Thread b1 = new Thread()   
        {
            public void run()
            {
                for(int i=0;i<20;i++)
                {
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e)
                    {

                    }

                    System.out.println(Thread.currentThread().getName()+":      B"+"    times:"+i);
                }
            }
        };
        
        
        
        Thread c1 = new Thread()   
        {
            public void run()
            {
                for(int i=0;i<20;i++)
                {
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e)
                    {

                    }

                    System.out.println(Thread.currentThread().getName()+":      C"+"    times:"+i);
                }
            }
        };
        
        
        
       
       
       
       a1.start();
       b1.start();
       c1.start();
       
    }

    
    
}
