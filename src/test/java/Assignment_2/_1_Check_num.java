package Assignment_2;

import java.util.Scanner;

public class _1_Check_num {
	
	public void CheckNum(int num) {
		
		switch(num)
		{
		case 0:
			System.out.println("num is Zero");
			break;
		case 1:
			System.out.println("num is One");
			break;
		case 2:
			System.out.println("num is Two");
			break;
		case 3:
			System.out.println("num is Three");
			break;
		case 4:
			System.out.println("num is Four");
			break;
		case 5:
			System.out.println("num is Five");
			break;
		case 6:
			System.out.println("num is Six");
			break;
		case 7:
			System.out.println("num is Seven");
			break;
		case 8:
			System.out.println("num is Eight");
			break;
		case 9:
			System.out.println("num is Nine");
			break;
			
		default:
			System.out.println("Enter a number b/n 0 to 9");
			break;
		}
		
	}
	
	 public static void main(String[] args) {
		 System.out.println("Enter a number");
		 Scanner sc = new Scanner(System.in);
		 int CheckNum = sc.nextInt();
		 sc.close();
		 
		 _1_Check_num value = new _1_Check_num();
		 value.CheckNum(CheckNum);
		 
		 
		 
		
	}
	 
	 

}
