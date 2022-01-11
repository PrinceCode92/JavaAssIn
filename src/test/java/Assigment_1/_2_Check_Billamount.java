package Assigment_1;

import java.util.Scanner;

public class _2_Check_Billamount {
	
	public void Billamount(int Bill ) 
	  {
		
		if (Bill <=300)
		{
	        int tax  = 50;
		    System.out.println("The Bill amount is-" + (Bill + tax));
	    }
		
		else if(Bill>300 && Bill<=500)
		{
			int tax = 20;
			System.out.println("The bill amount is-" +(Bill+tax));
			
		}
		else if(Bill>500 && Bill<=1000)
		{
			int tax = 10;
			System.out.println("The bill amout is-" + (Bill+tax));
		}
		
		else
		{
			System.out.println("No tax to bill amount- " +Bill);
		}

	  }
	
	public static void main (String[] args) {
	  System.out.println("Enter the amount");	
	 Scanner sc = new Scanner(System.in);
     int Billamount = sc.nextInt();
     sc.close();
    
    _2_Check_Billamount Useramount = new _2_Check_Billamount();
    Useramount.Billamount(Billamount);		
	
	
	
	
		
	
	}
}
