import java.io.*;
import java.util.*;
class thread1 implements Runnable{  
public void run(){  
	for(int i=0;i<5;i++) {
		try {
	
		Thread.sleep(500);
		}
		catch(Exception e)
		{
		
		}
		
		
	
System.out.println("thread is running..."+i);
		
}  
}


public static void main(String[] args){  
thread1 m1=new thread1();  
Thread t1 =new Thread(m1);  
Thread t2=new Thread(m1);
try {
//.sleep(100);
t1.start();
t1.sleep(1000);
t2.start();
}

	catch(Exception e) {
		
		
	}
	

 }  
}  