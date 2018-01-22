package java8threading;

import java.lang.*;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.*;
public class java8thread4{
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newWorkStealingPool();

		List<Callable<String>> callables = Arrays.asList(
		        () -> "task1",
		        () -> "task2",
		        () -> "task3");

		executor.invokeAll(callables)
		    .stream()
		    .map(future -> {
		        try {
		            return future.get();
		        }
		        catch (Exception e) {
		            throw new IllegalStateException(e);
		        }
		    })
		    .forEach(System.out::println);
	}
}