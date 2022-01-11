package Asssignment_3;

import java.util.Scanner;

public class _1_Calculat_Function {
	public void Addition(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition of num :" +c);			
	}
	
		
	public void Subtraction(int a, int b)
	{
		int c = a - b;
		System.out.println("Subtraction of num :" +c);
				
	}
 
	public void Multiplication(int a, int b)
	{
		int c = a * b;
		System.out.println("Multiplication of num :" +c);
	}

	public void Division(int a, int b)
	{
		int c = a /b;
		System.out.println("Dividion of num :" +c);
	}
	
	public static void main (String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b  = sc.nextInt();
		sc.close();
		
		_1_Calculat_Function Addition         = new _1_Calculat_Function();
		_1_Calculat_Function Subtraction      = new _1_Calculat_Function();
		_1_Calculat_Function Multiplication   = new _1_Calculat_Function();    
		_1_Calculat_Function Division         = new _1_Calculat_Function();  
		
		Addition.Addition(a, b);
		Subtraction.Subtraction(a, b);
		Multiplication.Multiplication(a, b);
		Division.Division(a, b);
		
	}
		

}
