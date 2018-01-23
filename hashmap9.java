import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;




public class hashmap9 {
 
	private String email;
	private String name;
	private int age;
 
	public hashmap9(String email, String name, int age) {
		this.email = email;
		this.name = name;
		this.age = age;
	}
	
	//Getters, setters 
 
        @Override
        public String toString() {
            return "Person [email=" + email + ", name=" + name + ", age=" + age + "]";
	}
private Object getEmail() {
			
			
			
			return this.email ;
		} 		
        public static void main(String args[]) {
        	
        
        List<hashmap9> people = Arrays.asList(
        	     new hashmap9("mario@reversecoding.net", "Mario", 27),
        	     new hashmap9("luigi@reversecoding.net", "Luigi", 30),
        	     new hashmap9("steve@reversecoding.net", "Steve", 20)
        	 );
        			
        	
        Map<Object, hashmap9> mapEmailPerson = 
                people.stream()
                      .collect(Collectors.toMap(hashmap9::getEmail, Function.identity()));
	

			System.out.println(mapEmailPerson);
			
			
			Map<Object, hashmap9> mapEmailPerson1 = 
			         people.stream()				
			               .collect(Collectors.toMap(person -> person.getEmail(), person->person));
					
			System.out.println(mapEmailPerson1);


    }

			
        	
}
