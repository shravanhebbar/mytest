import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {

   public static void main(String args[]) {
      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
      
      System.out.println("Print all numbers:");
		     
      eval(list, n -> true);
	
      System.out.println("Print even numbers:");
      eval(list, n-> n%2 == 0);
		
     
   }
	
   public static void eval(List<Integer> list, Predicate<Integer> predicate) {

      for(Integer n: list) {

         if(predicate.test(n)) {
            System.out.println(n + " ");
         }
      }
   }
}