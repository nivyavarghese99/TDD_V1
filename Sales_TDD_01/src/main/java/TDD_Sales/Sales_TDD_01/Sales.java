package TDD_Sales.Sales_TDD_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sales {
private List<Items> itemlist;
final private List<Items> ItemNameandQuantity;
//final private List<Items> ItemNameandQuantity;
int ArrayListindexCounter=0;
int originalQuantity = 0;

public Sales(){
	
	itemlist = new ArrayList<Items>();
	//This ArrayList is created to store the initial values of book Inventory.
	ItemNameandQuantity= new ArrayList<Items>();
}

public int addItems(Items item,Items item1){
	
	itemlist.add(item);
	ItemNameandQuantity.add(item1);
	return ArrayListindexCounter++;
	
}


//public void getInitialQuantity(String ItemName){
//	
//for(int j=0;j<ItemNameandQuantity.size();j++){
//		
//		if(ItemName.equals(ItemNameandQuantity.get(j).getItemNumber())){
//			
//			originalQuantity=ItemNameandQuantity.get(j).getItemNumber();
//			
//						
//		}
//		
//		
//	}
//	
//			
//	}


public double totalpriceCalculation(String ItemName,int ItemNumber){
	
	double Total = 0.0;
	
			
	for (int i=0; i<itemlist.size(); i++){
		
		if(itemlist.get(i).getItemNumber() !=0){
		
		if(ItemName.equals(itemlist.get(i).getItemName())){
		Total= (ItemNumber*itemlist.get(i).getPrice());
				
//		ItemNumber=itemlist.get(i).getItemNumber();
//		itemlist.get(i).setItemNumber(ItemNumber-1);
		System.out.println("total:"+Total);
						
							
		}
		
		
		}else{
			
			return 0;
			
			
		}
	}
		
	
	return Total;
	
}

public int ProductReturn(String ItemName){
	
	int ItemNumber;
	int returnStatus = 0;
	
	System.out.println("Inside Book Return Method");
	
	for (int i=0; i<itemlist.size(); i++){
		
		System.out.println("Product Quantity"+itemlist.get(i).getItemNumber());
		
						
		if(ItemName.equals(itemlist.get(i).getItemName())){
						
								
			ItemNumber =itemlist.get(i).getItemNumber();
				itemlist.get(i).setItemNumber(ItemNumber+1);
				
				returnStatus=1;
								
				break;
			
			}else{
				
				returnStatus=0;
				
			}
				
			
		}
	return returnStatus;
		
}


@Override
public String toString(){
	String TotalProducts="\n";
	
	Iterator<Items> i = itemlist.iterator();
	while(i.hasNext()){
		Items p = (Items) i.next();
		TotalProducts = TotalProducts + p.toString();
	}
	return TotalProducts;
	
}









	

}

