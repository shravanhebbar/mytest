package mongosample;



import java.net.UnknownHostException;
import java.util.ArrayList;

import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;



public class Sample{
	public static void main(String[] args) throws UnknownHostException {

		try {

			/**** Connect to MongoDB ****/
			
			@SuppressWarnings("resource")
			MongoClient mongo = new MongoClient("localhost", 27017);

			/**** Get database ****/
			
			@SuppressWarnings("deprecation")
			DB db = mongo.getDB("testdb");

			/**** Get collection / table from 'testdb' ****/
			
			DBCollection table = db.getCollection("user");

			
			
			/**** Insert ****/
			
			BasicDBObject document = new BasicDBObject();
			document.put("name","shravan");
			document.put("age",26);
			//document.put("createdDate", new Date());
			table.insert(document);

			/**** Find and display ****/
			BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put("name", "shravan");

			DBCursor cursor = table.find(searchQuery);

			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}

			/**** Update ****/
			
			BasicDBObject query = new BasicDBObject();
			query.put("name","shravan");

			BasicDBObject newDocument = new BasicDBObject();
			newDocument.put("name","shravanhebbar");

			BasicDBObject updateObj = new BasicDBObject();
			updateObj.put("$set", newDocument);

			table.update(query, updateObj);

			/**** Find and display ****/
			BasicDBObject searchQuery2 
				= new BasicDBObject().append("name","shravanhebbar");

			DBCursor cursor2 = table.find(searchQuery2);

			while (cursor2.hasNext()) {
				 System.out.println(cursor2.next());
			}

			
			BasicDBObject inQuery = new BasicDBObject();
			List<Integer> list = new ArrayList<Integer>();
			list.add(26);
			
			inQuery.put("number", new BasicDBObject("$in", list));
			DBCursor cursor1 = table.find(inQuery);
			while(cursor1.hasNext()) {
				System.out.println(cursor1.next());
			}
			System.out.println("Done");
			

		}
		catch (MongoException e)
		{
			e.printStackTrace();
		}

	}
}