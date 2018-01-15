import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class sorting {

   public static void main(String args[]) {
   
      List<String> names1 = new ArrayList<String>();
      names1.add("z ");
      names1.add("Suresh ");
      names1.add("Ramesh ");
      
     
      sorting tester = new sorting();
      tester.sortUsingJava8(names1);
      System.out.println("Sort using Java 8 syntax: ");
		System.out.println(names1);
     
     
   }
   
   //sort using java 7
   
   //sort using java 8
   String s1,s2;
   private void sortUsingJava8(List<String> names) {
      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
   }
}