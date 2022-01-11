package Assignment_2;

import java.util.Scanner;

public class _2_Check_day {
	public void Days(int day)
	{
		switch (day)
		{
		case 0:
		{
			System.out.println("SUNDAY");
			break;
		}
		case 1:
		{
			System.out.println("MONDAY");
			break;
		}
		case 2:
		{
			System.out.println("TUESDAY");
			break;
		}
		case 3:
		{
			System.out.println("WEDNESDAY");
			break;
		}
		case 4:
		{
			System.out.println("THURSDAY");
			break;
		}
		case 5:
		{
			System.out.println("FRIDAY");
			break;
		}
		case 6:
		{
			System.out.println("SATURDAY");
			break;
		}
		default :
		{
			System.out.println("Enter a num b/n 0 to 6");
			break;
		}	
		}
	}
	 public static void main (String[] args)
	 {
		 System.out.println("Enter a NUMBER");
		 
		 Scanner sc = new Scanner(System.in);
		 int day = sc.nextInt();
		 sc.close();
		 
		 _2_Check_day check = new _2_Check_day();
		 check.Days(day);
		 
	 }
	  

}
