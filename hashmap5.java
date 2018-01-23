import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
class hashmap5{
	public static void main(String args[]) {
	    Map<String, String> map = new HashMap<>();
	    map.put("C", "c");
	    map.put("B", "b");
	    map.put("Z", "z");
	    List<Map.Entry<String, String>> sortedByKey = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
	        .collect(Collectors.toList());
	    sortedByKey.forEach(System.out::println);
	    map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
	    map.replaceAll((k, v) -> "x");
	    map.forEach((k,v)->System.out.println(v));
	    map.putIfAbsent("B", "x");
	    System.out.println(map.get("B"));
	    map.merge("B", "new", (v1,v2)->v1+v2);
	    System.out.println(map.get("B"));
	}
}