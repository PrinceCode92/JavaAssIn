package Assignment_4;

import java.util.Scanner;

public class _1_Reverse_String {

	public void Reverse_word(String str)
	  {
		String revWord[] = str.split(" ");
		for(int i = revWord.length-1;i>=0;i--)
	     {
		   System.out.print(revWord[i]+ " ");
		 }
	  }
	
	public static void main (String[] args)
	{
	
		System.out.println("Enter the words:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		_1_Reverse_String Reverseword = new _1_Reverse_String();
		Reverseword.Reverse_word(str);	
	
	}
}
