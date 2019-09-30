package programmpractise;

import java.util.Scanner;

public class traingle2 {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Please enter number: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+(i+j)%2+" ");
			}
			System.out.println();
		}

	}

}
