package Strings;

public class BinarySearch {
	public static void main(String [] args)
	{
		int [] a= {2,3,4,5,6,7,8,9};
		int key=9;
		int st=0;
		int end=a.length-1;
		
		while(st<=end)
		{
			int mid=(st+end)/2;
			if(key==a[mid])
			{
				System.out.println("element is present");
				break;
			}
			else if(key<a[mid])
			{
				end=mid-1;
			}
			
			else
			{
				st=mid+1;
			}
		}
		if(st>end)
		{
			System.out.println("element not present");
		}
	}
}
