package programmpractise;

public class reverseword {

	public static void main(String[] args) {
		
		String reverse="";
		
		String[] str="Java is kava".split(" ");
		
		for(int i=str.length-1;i>=0;i--)
		{
			reverse=reverse+" "+str[i];
		}
		
		System.out.println("Reverse string is: "+reverse);

	}

}
