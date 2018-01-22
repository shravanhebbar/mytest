import java.util.*;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

import java.io.*;
import java.lang.*;

class hashmap2{
	
	public static void main(String args[]) {
		
		HashMap<String,String> s=new HashMap<String,String>();
		HashMap<String,String> ss=new HashMap<String,String>();
		Scanner s1=new Scanner(System.in);
		int k=0;
		k=s1.nextInt();
		for(int i=0;i<k;i++) {
			String  a,b;
			 a=s1.next();
			 b=s1.next();
			  s.put(a,b);
			  ss.put(a,b);
		}
			 int count=0;
			 
				 
				 for(Map.Entry<String,String> e1:  s.entrySet())
				    { 
				        for(Map.Entry<String, String> e2:  ss.entrySet())
				        {    int i=0;
				          if (e1.getKey() != e2.getKey())
				            {
				           //compare e1.getValue() to e2.getValue()
				        	  
				        	 if(e1.getValue().compareTo((e2.getValue()))==0)
				        	 //System.out.println();
				        	  count++;
				        	  
				        	  
				            
				        }
				     
				 
				 
			 }
				      
			 
			
			
			
		}
				  System.out.println(count);
					 
		
		
		
		
		
		
		
	}
	
	
	
	
	
}