package mongosample;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;
import com.mongodb.ReadConcern;  
public class ListAllCollections {
	public static void main( String args[] ) {  
	      
	     try {
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 

	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("sampleUser", "testdb", 
	         "password".toCharArray()); 

	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("testdb"); 
	      System.out.println("Collection created successfully"); 
	      for (String name : database.listCollectionNames()) { 
	         System.out.println(name); 
	      }
	      //Database ToString
	    System.out.println(database.toString());
	    
	}
	catch(Exception e) {
		System.out.println(e);
		
	}

}
}
