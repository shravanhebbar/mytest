import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class stream2{
	public static void main(String args[]) {
		List<String> items = new ArrayList<String>();

		items.add("one");
		items.add("two");
		items.add("three");

		Stream<String> stream = items.stream();
		System.out.println(stream);
		
		
		
		@SuppressWarnings("unchecked")
		List<String> l=(List<String>) items.stream().filter(s->s.startsWith("o")).collect(Collectors.toList());
	Iterator<String>  s=l.iterator();
	while(s.hasNext()) {
		System.out.println(s.next());
	}
		//List<String> ll=items.stream().map(s1->s1.toLowerCase()).collect(Collectors.toList());
	//@SuppressWarnings("unchecked")
List<String> x= (List<String>) items.stream().filter(v -> v.endsWith("e")).collect(Collectors.toList());
		x.forEach(p->System.out.println(p));
	
	
		 String shortest = items.stream().min(Comparator.comparing(item -> item.length())).get();
		System.out.println(shortest);
	}
}
