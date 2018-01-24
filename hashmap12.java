import java.util.*;
import java.io.*;
import java.lang.*;

class hashmap12{
	public static void main(String[] args) {
		
		List<String> ss=new ArrayList<String>();
		int[]  aa=new  int[10];
		int test;
		Scanner s=new Scanner(System.in);
		test=s.nextInt();
		while(test>0) {
			int num,g;
			num=s.nextInt();
			g=s.nextInt();
			
			for(int i=0;i<num;i++) {
				ss.add(s.next());
			}
			if(num%g==0) {
				
for(String ss1:ss) {
	int nn=ss1.length();
	aa[nn]++;
}
int m=0;
for(int j=0;j<10-1;j++) {
	if(aa[j]==g){
		m++;
	}
}
System.out.println(m);
	if(m==(num/g)) {
		System.out.println("yes");
	}else
	{
		System.out.println("no");
	}	
}		
	test--;
			
		}
		
		
	}
}