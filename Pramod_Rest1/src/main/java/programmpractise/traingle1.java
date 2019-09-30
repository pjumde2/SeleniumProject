package programmpractise;

import java.util.Scanner;

public class traingle1 {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Please enter num:");
		
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}

	}

}
