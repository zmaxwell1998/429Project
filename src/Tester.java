import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import database.JDBCBroker;
import database.SQLQueryStatement;
import database.SQLSelectStatement;
import database.SQLStatement;
import model.Book;
import model.BookCollection;
import model.InventoryItem;
import model.InventoryItemCollection;
import model.Patron;
import model.PatronCollection;
import model.Teller;
import model.Vendor;

public class Tester {
	public static void main(String[] args) {
		newTest();
		System.out.println("ffrrfqf");
	}
	
	private static void newTest() {
		// this one is for the group project
		
		//InventoryItemCollection iic = new InventoryItemCollection("InventoryItem");
		
		/////////////////////////////////////////////////////////////////////// Inventory Item Type TEST
		/*Properties p1 = new Properties();
		//p1.setProperty("Barcode", "");
		p1.setProperty("InventoryItemTypeName", "Jimmy Neutron");
		p1.setProperty("VendorId", "11414");
		p1.setProperty("DateReceived", "10/10/10");
		p1.setProperty("DateOfLastUse", "02/02/01");
		p1.setProperty("Notes", "special note");
		p1.setProperty("Status", "Available");
		InventoryItem it = new InventoryItem(p1);
		it.update();*/
		
		//System.out.println(iic.toArrayList().size());
		
		/////////////////////////////////////////////////////////////////////// Vendor TEST
		/*Properties p2 = new Properties();
		//p2.setProperty("Id", "");
		p2.setProperty("Name", " Shrek the Ogre");
		p2.setProperty("PhoneNumber", "585-585-5855");
		p2.setProperty("Status", "Active");
		
		Vendor ve = new Vendor(p2);
		ve.update();*/
		
	
	
	}
	
	private static void oldTest() {
		// EXAMPLE OF SETTING UP A NEW BOOK
				BookCollection bc = new BookCollection("Book");
				Properties p1 = new Properties();
				//p1.setProperty("bookId", "222");
				p1.setProperty("author", "Jane Doe");
				p1.setProperty("title", "Jane's Adventures");
				p1.setProperty("pubYear", "1998");
				p1.setProperty("status", "");
				Book b = new Book(p1);
				b.update();
				
				System.out.println("----------------------------------------");
				//bc.findBooksWithTitleLike("Jane");
				System.out.println(bc.print());
				System.out.println("----------------------------------------");
				//bc.findBooksOlderThanDay("1997");
				//System.out.println(bc.print());
				System.out.println("----------------------------------------");
				

				// EXAMPLE OF SETTING UP A NEW PATRON
				PatronCollection pc = new PatronCollection("Patron");
				Properties p2 = new Properties();
				//p2.setProperty("patronId", "12");
				p2.setProperty("name", "John Doe");
				p2.setProperty("address", "123 cool st");
				p2.setProperty("city", "Hampton");
				p2.setProperty("stateCode", "31");
				p2.setProperty("zip", "2347");
				p2.setProperty("email","johnDoe99@example.com");
				p2.setProperty("dateOfBirth", "06/13/2002");
				p2.setProperty("status", "Alive");
				Patron p = new Patron(p2);
				p.update();
				
				System.out.println("----------------------------------------");
				pc.findPatronsYoungerThan("09/1/2008");
				System.out.println(pc.print());
				System.out.println("----------------------------------------");
				pc.findPatronsAtZipCode("2347");
				System.out.println(pc.print());
				System.out.println("----------------------------------------");
	}
}
