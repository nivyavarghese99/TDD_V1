package TDD_Sales.Sales_TDD_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sales {
private List<Items> itemlist;
final private List<Items> ItemNameandQuantity;

int ArrayListindexCounter=0;

public Sales(){
	
	itemlist = new ArrayList<Items>();
	
	ItemNameandQuantity= new ArrayList<Items>();
}

public int addItems(Items item,Items item1){
	
	itemlist.add(item);
	ItemNameandQuantity.add(item1);
	return ArrayListindexCounter++;
	
}


public double totalpriceCalculation(String ItemName,int ItemNumber){
	
	double Total = 0.0;
	
			
	for (int i=0; i<itemlist.size(); i++){
		
		if(itemlist.get(i).getItemNumber() !=0){
		
		if(ItemName.equals(itemlist.get(i).getItemName())){
		Total= (ItemNumber*itemlist.get(i).getPrice());

							
		}
		
		
		}else{
			
			return 0;
			
			
		}
	}
		
	
	return Total;
	
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

