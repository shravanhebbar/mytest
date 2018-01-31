import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class predicate2 {
	public static void main(String[] args) {

		//Predicate String 
		Predicate<String> predicateString = s -> {
			return s.equals("Hello");
		};

		System.out.println(predicateString.test("Hello"));
		System.out.println(predicateString.test("Hello World"));

		//Predicate integer
		Predicate<Integer> predicateInt = i -> {
			return i > 0;
		};

		System.out.println(predicateInt.test(5));
		System.out.println(predicateInt.test(-5));
		
		
		List<String> ss=new ArrayList<String>();
		ss.add("sss");
		ss.add("hhhh");
		ss.add("lllll");
		
		eval(ss,s->s.length()>4);
		
		Predicate<String> predicateAnd=predicateString.and(s->s.length()>4);
		System.out.println(predicateAnd.test("Hello"));
		
		
		Predicate<String> predicateAnd1=predicateString.or(s->s.length()>4);
		System.out.println(predicateAnd1.test("Helll"));
		
	}
	public static void eval(List<String> ss,Predicate<String> g) {
		
		 for(String h:ss) {
			 if(g.test(h)) {
				 System.out.println(h);
			 }
		 }
	}
}