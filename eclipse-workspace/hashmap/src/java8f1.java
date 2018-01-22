import java.util.*;
import java.util.function.Consumer;
import java.io.*;
import java.lang.*;


class java8f1
{
public static void main(String[] args) {
		
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		Set<Integer> set=new HashSet<Integer>();
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i=0;i<5;i++) {
			hash.put(i, i);
		}
		for(int i=0; i<5; i++) {
			myList.add(i);
		
		set.add(i);
		}
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

		});
		set.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("set anonymous class Value::"+t);
			}

		});
		Set Set1=hash.entrySet();
		Iterator itt =Set1.iterator();
		while(itt.hasNext()){
			Map.Entry<Integer, Integer> ee=(Map.Entry) itt.next();
			System.out.println("Iterator Value of hash map::"+ee.getValue());
		}
		
		for(Map.Entry<Integer,Integer> ss : hash.entrySet())
		{
		System.out.println(ss.getValue());	
		
		}
		
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}

}

