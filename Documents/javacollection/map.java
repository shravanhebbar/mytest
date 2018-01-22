import java.util.*;
import java.io.*;
public class map {

   public static void main(String args[]) {
      // Create a hash map
      HashMap<String,Double> hm = new HashMap<String,Double>();

      // Put elements to the map
      hm.put("Zara", 3434.34);
      hm.put("Mahnaz", 123.22);
      hm.put("Ayan", 1378.00);
      hm.put("Daisy", 99.22);
      hm.put("Qadir", -19.08);
      
      // Get a set of the entries
      //Set set = hm.entrySet();
      
      // Get an iterator
     Iterator i =hm.iterator();
     
      // Display elements 
      while(i.hasNext()) {
         //Map.Entry me = (Map.Entry)i.next();
         System.out.print(i.getKey() + ":");
         System.out.println(i.getValue());
      }
      System.out.println();
     
      // Deposit 1000 into Zara's account
      double balance = ((Double)hm.get("Zara")).getValue();
      hm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " + hm.get("Zara"));
   }
}
