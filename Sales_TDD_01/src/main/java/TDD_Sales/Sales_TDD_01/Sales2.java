package TDD_Sales.Sales_TDD_01;
import java.util.Scanner;

public class Sales2 {

	    public static void main(String[] args)
	    {
		final int SALESPEOPLE = 2;
		int[] sales = new int[SALESPEOPLE];
		int sum;
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<sales.length; i++)
		    {
			System.out.print("Enter sales for salesperson " + (i+1) + ": ");
			sales[i] = scan.nextInt();
		    }
		System.out.println("\nSalesperson   Sales");
		System.out.println("--------------------");
		sum = 0;
	        int maximum = sales[0];
	        int minimum  = sales[0];
	        int a=1, b=1;
		for (int i=0; i<sales.length; i++)
		    {
			if(maximum < sales[i])
	                {
	                    maximum = sales[i];
	                    a = i+1;
	                }
	                if(minimum > sales[i])
	                {
	                    minimum = sales[i];
	                    b = i+1;
	                }
	                System.out.println("     " + (i+1) + "         " + sales[i]);
			sum += sales[i];
		    }
		System.out.println("\nTotal sales: " + sum);
	        System.out.println("The average sale is: " + sum / SALESPEOPLE );
	        System.out.println("The maximum sale is: " + maximum + " by Salesperson " + a );
	        System.out.println("The minimum sale is: " + minimum + " by Salesperson " + b );
//	        
	    }
	

}
