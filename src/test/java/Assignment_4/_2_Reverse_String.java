package Assignment_4;

import java.util.Scanner;

public class _2_Reverse_String {
	public void ReverseString(String str)
	{
		for(int i = str.length()-1; i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}	
	  public static void main (String[] args)
	  {
		System.out.println("Enter a word:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		_2_Reverse_String NewWord = new _2_Reverse_String();
		NewWord.ReverseString(str);
	  }
	

}
