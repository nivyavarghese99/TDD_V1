package TDD_Sales.Sales_TDD_01;

public class Items {
private String Category;
private String ItemName;
private double price;
private double buy;
private int ItemNumber;

public String getCategory() {
	return Category;
}
public int getItemNumber() {
	return ItemNumber;
}
public void setItemNumber(int ItemNumber) {
	this.ItemNumber = ItemNumber;
}
public void setCategory(String Category) {
	this.Category = Category;
}
public String getItemName() {
	return ItemName;
}
public void setItemName(String ItemName) {
	this.ItemName = ItemName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getBuy() {
	return buy;
}
public void setBuy(double buy) {
	this.buy = buy;
}


	
public Items(){
	Category=null;
	ItemName=null;
	price=0.0;
	ItemNumber=0;
	
}
@Override
public String toString(){
	return "\nCategory: " + Category + "\nItemName: " + ItemName +
			"\nPrice: " + price + "\nAvailable no of Products"+ItemNumber+"\n_____________________";
}



}

