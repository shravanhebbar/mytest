import java.util.*;
import java.util.function.Predicate;
import java.io.*;
class hashmap10{
	public static void main(String[] args) {
		int cases=0;
		Scanner s=new Scanner(System.in);
		cases=s.nextInt();
		for(int i=0;i<cases;i++) {
			
			List<Integer> arr=new ArrayList<Integer>();
			int size=0,test=0;
			size=s.nextInt();
			test=s.nextInt();
			for(int j=0;j<size;j++) {
				arr.add(s.nextInt());
			}
			
			while(test>0) {
				int search;
				
				search=s.nextInt();
				
			int n1=	eval(arr, n -> n==search);
			if(n1>0) {
			System.out.println(n1);
			}
			else
			{
				System.out.println(0);
			}
						  
				test--;
				
			}
			
			
	}
}
	public static int eval(List<Integer> list, Predicate<Integer> predicate) {
		int count=0;
			      for(Integer n: list) {

			         if(predicate.test(n)) {
			           count++;
			         }
			      }
			      return count;
			   }

}