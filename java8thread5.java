package java8threading;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class java8thread5{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		
		ExecutorService executor = Executors.newWorkStealingPool();

		List<Object> callables = Arrays.asList(
		    callable("task1", 1),
		    callable("task2", 1),
		    callable("task3", 4));

		@SuppressWarnings("unchecked")
		String result = executor.invokeAny((Collection<? extends Callable<String>>) callables);
		System.out.println(result);
		
		
	}
	static Callable<String> callable(String result, long sleepSeconds) {
	    return () -> {
	        TimeUnit.SECONDS.sleep(sleepSeconds);
	        return result;
	    };
	}

	
}
	