package java8threading;


import java.util.concurrent.*;
import java.util.stream.IntStream;



public class java8thread7 {

    public static void main(String args[]) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        try {
        	
        IntStream.range(0, 100).forEach(i -> service.submit(() -> System.out.println("Task ID : " + i + " performed by "
                                                                                + Thread.currentThread().getName())));
       service.awaitTermination(0, null);
        	
        }
        catch(Exception e) {
        	
        }
    }
}