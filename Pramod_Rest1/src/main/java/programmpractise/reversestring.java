package programmpractise;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		
		String original, reverse="";
		
		System.out.println("Please enter String: ");
		
		Scanner scan=new Scanner(System.in);
		original=scan.nextLine();
		
	   for(int i=original.length()-1;i>=0;i--)
	   {
		   reverse=reverse+original.charAt(i);
	   }
	   
	   System.out.println("Reverse string is: "+reverse);
		

	}

}
