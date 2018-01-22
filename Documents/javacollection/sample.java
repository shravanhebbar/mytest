import java.util.*;
import java.io.*;
public class sample {

   public static void main(String[] args) throws IOException{
      // ArrayList 
      ArrayList<String> a1 = new ArrayList<String>();
      a1.add("Zara");
      a1.add("Mahnaz");
      if(a1.contains("Zara"))
{System.out.println("duplicate copy");
}
else
{a1.add("Zara");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);
}

      // LinkedList
      LinkedList<String> l1 = new LinkedList<String>();
      l1.add("Zara");
      l1.add("Mahnaz");
     if( l1.add("Zara")!= false){
      System.out.println();
      System.out.println(" LinkedList Elements");
System.out.println(l1.subList(0,2));
     //	 System.out.print("\t" + l1);
}

      // HashSet
      HashSet<String> s1 = new HashSet<String>(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      if(s1.add("Zara")==true){
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);
}

      //HashMap
      /*HashMap<String,String> m1 = new HashMap<String,String>(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
     m1.put("Zara", "14"){
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);*/

   }
}
