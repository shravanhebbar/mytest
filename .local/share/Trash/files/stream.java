import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
class stream{
	public static void main(String[] args) {
		int count=0;

List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
System.out.println(filtered);

int c=(int) strings.stream().filter(string -> string.isEmpty()).count();
System.out.println(c);
System.out.println("Using Java 8: ");
System.out.println("List: " +strings);
	
count = (int) strings.stream().filter(string->string.isEmpty()).count();
System.out.println("Empty Strings: " + count);
	
count = (int) strings.stream().filter(string -> string.length() == 3).count();
System.out.println("Strings of length 3: " + count);
	
filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
System.out.println("Filtered List: " + filtered);
	
String mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining("."));
System.out.println("Merged String: " + mergedString);
List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);	
List<Integer> squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
System.out.println("Squares List: " + squaresList);
System.out.println("List: " +numbers);
	
IntSummaryStatistics stats = numbers.stream().mapToInt((x) ->x).summaryStatistics();
	}
}