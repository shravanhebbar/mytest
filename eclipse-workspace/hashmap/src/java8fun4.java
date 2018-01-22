import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.Object;
import com.sun.xml.internal.ws.util.StringUtils;




class  java8fun4{
	
	public static void main(String args[]) {
		List<String> numbers = Arrays.asList("How", "To", "Do", "In", "Java");
		String joinedString =   numbers
		                        .stream()
		                        .collect(Collectors.joining(",","[","]"));
		 
		System.out.println(joinedString);
	
	}
}