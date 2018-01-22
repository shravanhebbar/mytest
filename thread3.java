import java.io.*;
import java.util.*;



class thread3 extends Thread{  
     public void run(){  
       System.out.println("running thread name is:"+Thread.currentThread().getName());  
       System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
      
      }  
     public static void main(String args[]){  
      thread3 m1=new thread3();  
     thread3 m2=new thread3();  
      m1.setPriority(Thread.MIN_PRIORITY);  
      m2.setPriority(Thread.MAX_PRIORITY);  
      m1.start(); 
     try {
    	 m1.join();
     }
     catch(Exception e){
    	 
     }
      m2.start();  
       
     }  
    }     