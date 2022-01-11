package Assigment_1;

import java.util.Scanner;

public class _1_Check_Condition {
	public  void Checkcondition(double num) {
		
		
		if(num<300)
		{
			System.out.println("given number is smaller then  num"  );
			
		}
		else if(num== 300) 
		{
			System.out.println("given num is equal  to num ");
		  
		}
		else
		{
			System.out.println("given num is greater then num");
		}
	}	
		public static void main(String [] args) {
		
		System.out.println("Enter a number--");
		Scanner sc = new Scanner(System.in);
		double num =sc.nextDouble();
		sc.close();
		
		_1_Check_Condition user = new _1_Check_Condition();
		user.Checkcondition(num);
		}
	}


