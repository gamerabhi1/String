package Strings;

public class LinearSearch {
	public static void main(String [] args)
	{
		int []a= {2,4,6,8,10,12,14};
		int key=12;
		int st=0;
		int end=a.length-1;
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				flag=false;
				System.out.println("elemnt is present ->"+ i);
				break;
			}
		}
		if(flag)
			System.out.println("not present");
	}

}
