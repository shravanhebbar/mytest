package java8threading;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class java8thread2{
	

public static void main(String[] args) {
	



ExecutorService executor = Executors.newSingleThreadExecutor();
executor.submit(() -> {
    String threadName = Thread.currentThread().getName();
    System.out.println("Hello " + threadName);
});


Thread ss=new Thread();
Thread ss1=new Thread();
ss.run();
try {
	ss1.start();
ss.start();
executor.awaitTermination(5, TimeUnit.SECONDS);
executor.shutdown();
}
catch(Exception e)
{
		
}



}
}