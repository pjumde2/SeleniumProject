package programmpractise;

public class duplicatewords {

	public static void main(String[] args) {
		
		int count=1,total=0;
		
		String[] str="abc,bdc,abc,dfg,ghj,dfg".split(",");
		
		for(int i=0;i<=str.length-1;i++)
		{
			for(int j=i+1;j<=str.length-1;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="0";
					
				}
				
			}
						
			if(str[i]!="0")
			{
				System.out.println(str[i]+"---------"+count);
				total=total+count;
			}
			
			count=1;
		}
		
	   System.out.println("Total words are: "+total);
		

	}

}
