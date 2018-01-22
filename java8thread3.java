package java8threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
class java8thread3{
	public static void main(String[]  args) throws InterruptedException, ExecutionException {
	Callable<Integer> task = () -> {
	    try {
	        TimeUnit.SECONDS.sleep(1);
	        return 123;
	    }
	    catch (InterruptedException e) {
	        throw new IllegalStateException("task interrupted", e);
	    }
	};
	
	Callable<Integer> task1 = () -> {
	    try {
	        TimeUnit.SECONDS.sleep(1);
	        return 122;
	    }
	    catch (InterruptedException e) {
	        throw new IllegalStateException("task interrupted", e);
	    }
	};
	ExecutorService executor = Executors.newFixedThreadPool(1);
	ExecutorService executor1 = Executors.newFixedThreadPool(1);
	Future<Integer> future = executor.submit(task);
Future<Integer> future1=executor1.submit(task1);
	System.out.println("future done? " + future.isDone());
	System.out.println(future1.isDone());

	Integer result = future.get();
Integer result1=future1.get();
	System.out.println("future done? " + future.isDone());
	System.out.print("result: " + result);
	System.out.print("result: " + result1);
	
executor.shutdown();
}
}