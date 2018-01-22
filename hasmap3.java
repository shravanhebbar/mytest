import java.io.*;
import java.util.*;
public class hasmap3{
	public static void main(String args[]) {
		
	
	Set<Integer> s=new HashSet<Integer>();
	int a,b;
	Scanner ss=new Scanner(System.in);
	a=ss.nextInt();
	b=ss.nextInt();
	for(int i=0;i<a;i++) {
		s.add(ss.nextInt());
	}
	
	int flag=0;
	
	   for (Integer key1: s){
		   if(flag==0) {
		   for (Integer key: s) {
			
			if((key1+key)==b) {
				System.out.println("Yes");
				flag=1;
				break;
			}
			
			
		}
		
	}
	}
	
	
	
	
	
	
}
}