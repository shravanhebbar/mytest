import java.io.*;
import java.util.*;
import java.lang.*;


class thread2 extends Thread{  
     public void run(){  
      for(int i=1;i<=5;i++){  
       try{  
        Thread.sleep(500);  
       }catch(Exception e){System.out.println(e);}  
      System.out.println(i); 
      System.out.println(Thread.currentThread().getName());
      }  
     }  
    public static void main(String args[]){  
     thread2 t1=new thread2();  
    thread2 t2=new thread2();  
   thread2 t3=new thread2();  
     t1.start();  
     try{  
      t1.join(600); 
      
      
     }catch(Exception e){System.out.println(e);}  
     
         
     t2.start();  
     t3.start();  
     }  
    }  