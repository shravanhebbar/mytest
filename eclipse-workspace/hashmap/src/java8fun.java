import java.util.*;

import java.io.*;
import java.lang.*;

public class java8fun{
	

public static void main(String args[]) {
	
List<Integer> numbers=new ArrayList();
java8fun ss=new java8fun();
for(int i=0;i<5;i++) {
	numbers.add(i);
}

try{
	

ss.finds(numbers);
}
catch(Exception e) {
	System.out.println(e);
	
}


}
public void finds(List<Integer> numbers) {

		
		System.out.println( numbers.stream()
				.filter(i ->i%2!=0) 		
				.filter(i->i>=3)	
				.filter(i->i<11)	
				.max(Comparator.naturalOrder())
				.map(i -> i * i)
				.get());
		
	
}
    


}