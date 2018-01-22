import java.util.*;
import java.lang.*;
import java.io.*;
class hashmap1{
 public static void main(String args[])
{
    int test;
    Scanner s=new Scanner(System.in);
    test=s.nextInt();
    while(test>0)
    {
        String S;
        String T;
       S=s.next();
       T=s.next();
        int hashS[]=new int[256];
        int hashT[]=new int[256];
        for(int i=0;i<S.length();i++)
            hashS[i]++;
        for(int i=0;i<T.length();i++)
            hashT[i]++;
        int count=0;
        for(int i=0;i<256;i++)
        {
            count = count +Math.abs (hashT[i]-hashS[i]);
        }   
        System.out.println(count);
    }
    s.close();
    
}
}
