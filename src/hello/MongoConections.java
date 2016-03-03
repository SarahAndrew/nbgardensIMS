package hello;

import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.WriteResult;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import objects.Products;

import java.util.ArrayList;


public class MongoConections {
	
	public List<MongoCredential> getcreds( String db, String user, char[] pass) {
		List<MongoCredential> creds = new ArrayList<MongoCredential>();
		creds.add(MongoCredential. createPlainCredential( user, db, pass));
		return creds;
		}
	
	/**
	 * creating in mongo
	 * @param e - the object you want to pull out of the database
	 * @param host - where the database is (i.e.: localhost)
	 * @param port - the port number the database is on
	 * @param dbn - the name of the database
	 * @param user - the username to access the database
	 * @param pass - the password for the username
	 */
	public <E> void addEntity(E e, String host, int port, String dbn, String user, char[] pass) {
		MongoClient client = new MongoClient( new ServerAddress(host, port), getcreds(dbn, user, pass));
		MongoDatabase db = client.getDatabase(dbn);
		try {
		@SuppressWarnings("unchecked")
		MongoCollection<E> col = (MongoCollection<E>) db.getCollection(e.getClass().getName(). substring(e.getClass(). getName().lastIndexOf('.') + 1));
			//	db.getCollection(e.getClass().getName(). substring(e.getClass(). getName().lastIndexOf('.') + 1));
		col.insertOne(e);
		} catch(ClassCastException cce) {
		cce.printStackTrace();
		} finally {
		client.close();
		}
		}
	
	/**
	 * read an entry
	 * @param a
	 * @param host
	 * @param port
	 * @param dbn
	 * @param user
	 * @param pass
	 * @return
	 */
	public Products readEntity(Products p, String host, int port, String dbn, String user, char[] pass) {
		MongoClient client = new MongoClient( new ServerAddress(host, port), getcreds(dbn, user, pass));
		MongoDatabase db = client.getDatabase(dbn);
		MongoCollection col = db.getCollection( p.getClass().getName(). substring( p.getClass().getName().lastIndexOf('.') + 1));
		DBCursor c = (DBCursor) col.findOne( BasicDBObjectBuilder.start().add( "productID", p.getAid()));
		client.close();
		return (Products) c.next();
		}
	
	
}
