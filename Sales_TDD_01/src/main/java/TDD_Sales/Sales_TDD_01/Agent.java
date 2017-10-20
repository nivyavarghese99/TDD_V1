package TDD_Sales.Sales_TDD_01;

import java.util.Scanner;



public class Agent {
static Sales sal = new Sales();
static Scanner in = new Scanner(System.in);
static Boolean running = true;

public static void main(String[] args) {
	while (running) {
		System.out.println("\nEnter 0 Exit "
				+"\nEnter 1 add Item to Storage"
				+"\nEnter 2 to see the available product list"
				+"\nEnter 3 to buy a product");
				

		int answer = in.nextInt();
		
		switch (answer) {
		
		case 0:
			
			running=false;
			break;

		case 1:
			addItems();
			
			break;
		case 2:
			System.out.println(sal.toString());
			break;
		case 3:
			 buy();
			break;
//		case 4:
//			ProductReturn();
			
		}
		
	}
	System.exit(0);
	

}



private static void addItems() {
	
	 String Category;
	 String ItemName;
	 double price;

	 int ItemNumber; 

	System.out.println("\nEnter Category: ");
	Category = in.next();

	System.out.println("\nEnter ItemName: ");
	ItemName = in.next();

	System.out.println("\nEnter Price: ");
	price = in.nextInt();

	System.out.println("\nEnter No of quantities Available: ");
	ItemNumber=in.nextInt();


	Items i1= new Items();
	Items i2=new Items();
	i1.setCategory(Category);
	i1.setItemName(ItemName);
	i1.setPrice(price);

	i1.setItemNumber(ItemNumber);
	i2.setItemName(ItemName);
	i2.setItemNumber(ItemNumber);
	sal.addItems(i1, i2);
	
}

private static void buy() {
	
	 String ItemName;
	int ItemNumber;
	 double price;
	 
	System.out.println("\nEnter ItemName : ");
	ItemName = in.next();
System.out.println("\nEnter No of ItemNumber : ");

ItemNumber=in.nextInt();

	
	price=sal.totalpriceCalculation(ItemName,ItemNumber);

	if(price!=0){
	System.out.println("Your product details "+"\n ItemName : "+ItemName+"\n Quantity Requested : "+ItemNumber+"\nTotal Amount : "+price);
	}else
	{
		System.out.println("Sorry no such product available. NEw stocks coming next week. come later.Thanks Farmers! ");
		
	}
	
}

}



