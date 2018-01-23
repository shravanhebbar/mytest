import java.util.*;
import java.io.*;
import java.lang.*;
public class hashmap7{
	public static void main(String args[]) {
		 int ch=0,cc=0;
		Map<Integer,String > emp=new HashMap<Integer,String>();
		Map<Integer,List > emp1=new HashMap<Integer,List>();
		List<Integer > count=new ArrayList<Integer>();
		List<Integer > count1=new ArrayList<Integer>();
		
		for(int i=0;i<100;i++) {
			count.add(i);
		}
		Scanner s1=new Scanner(System.in); 
		for(int i=0;i<4;i++) {
		
		
		int a=s1.nextInt();
		while(a!=0) {
			 ch=s1.nextInt();
		
		Iterator<Integer> s=count.iterator();
		while(s.hasNext())
		{
			
		if(s.next().equals(ch)) {
					
			count1.add(ch);
		
		a--;
		}
		
		}
		
		
		
		}
		System.out.println("enter key value\n");
		 cc=s1.nextInt();
		emp1.put(cc,count1);
		System.out.println(emp1);
		
		}
		
	}
}