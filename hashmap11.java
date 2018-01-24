import java.util.*;
import java.io.*;
import java.lang.*;
class hashmap11{
	
	
	public static void main(String args[]) {
		int test=0;
		Scanner s=new Scanner(System.in);
		test=s.nextInt();
		
		
		while(test>0) {
			int flag=1;
			
			int[] count = new int[100];
			String str1;
			str1=s.next();
			char[] ss=new char[100];
			for(int i=0;i<100;i++) {
				count[i]=0;
			}
			ss=str1.toCharArray();
			System.out.println(ss);
		
			for(int i=0;i<ss.length;i++) {
				count[ss[i]-'a']++;	
				
			}
			for(int i=0;i<32;i++) {
			if(count[i]>=2) {
				System.out.println("YES");
				flag=0;
				break;
			}
			}
		if(flag==1) {
		System.out.println("NO");
	
		}
			
			test--;
		}
	}
}