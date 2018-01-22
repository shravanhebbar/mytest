import java.util.concurrent.*;
import java.util.*;
import java.io.*;
import java.lang.*;
 
class thread10 extends Thread {
 
    static CopyOnWriteArraySet<String> l = new CopyOnWriteArraySet<String>();
 
    public void run()
    {
        
        l.add("D");
    }
     
    @SuppressWarnings("unused")
	public static void main(String[] args) 
    {
        l.add("A");
        l.add("B");
        l.add("C");
 
        
        thread10 t = new thread10();
        t.start();
 
       
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("child going to add element");
        }
         
        //System.out.println(l);
         
            
			Iterator<String> itr = l.<String>iterator();
        while (itr.hasNext()) 
        {
            String s = (String)itr.next();
            System.out.println(s);
         
            if(s.equals("D"))
            {
               
                itr.remove();
            }
        }
    }
}