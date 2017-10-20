package TDD_Sales.Sales_TDD_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class SalesTest1 {
	
	private Sales obj;
	private Items obj1;
	int itemStorage;
	List<Items> itemlist;
	List<Items> ItemNameandQuantity;
	

	@Before
	public void setUp() throws Exception {
      int itemStorage=0;
		
      itemlist= new  ArrayList<Items>();
      ItemNameandQuantity= new ArrayList<Items>();
		obj= new Sales();
		obj1= new Items();
		obj1.setCategory("Electronics");
		obj1.setItemName("TV");
		obj1.setItemNumber(2);
		obj1.setPrice(345);
		
		itemStorage = obj.addItems(obj1, obj1);
		
//		
//		bookobj.setTitle("abc");
//		bookobj.setAuthor("ee");
//		bookobj.setPrice(12);
//		bookobj.setRent(1);
//		bookobj.setBookQuantity(1);
		//bookInventory=obj.addBooks(bookobj, bookobj);	
		

	}

	@After
	public void tearDown() throws Exception {
		obj=null;

	}

	@Test
	public void testAddItems() {
		
		obj1.setCategory("Electronics");
		obj1.setItemName("TV");
		obj1.setItemNumber(2);
		obj1.setPrice(345);
		
		itemStorage = obj.addItems(obj1, obj1);
		int addexpected = 1;
		assertEquals(addexpected,itemStorage);
		
		
		
	}

	@Test
	public void testTotalpriceCalculation() {
		double pexpetced=345*2;	
		double pactual = obj.totalpriceCalculation("TV",2);
		
	assertEquals(pexpetced,pactual,0.0);

	}

}
