package java8threading;

import java.lang.*;
import java.util.*;
import java.io.*;
class thread1{
	
public static void main(String[] args) {

// thread and runnable
	
Runnable task = () -> {
    String threadName = Thread.currentThread().getName();
    System.out.println("Hello " + threadName);
};

task.run();

Thread thread = new Thread(task);
Thread thread1=new Thread(task);


thread1.start();
try {
Thread.sleep(1000);
}
catch(Exception e) {
	System.out.println(e);
}

thread.start();



}
}