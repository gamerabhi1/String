package Strings;

//public class SubStringPalandrome 
//{
//	public static boolean isPalindrome(String s1)
//	{
//		int i=0;
//		int j=s1.length()-1;
//		while(i<j)
//		{
//			if(s1.charAt(i)!=s1.charAt(j))
//			{
//				return false;
//			}
//			i++;
//			j--;
//		}
//		return true;
//	}
//	public static void main(String [] args)
//	{
//		String s1="malayalam";
//		for(int i=0;i<s1.length();i++)
//		{
//			for(int j=i+3;j<s1.length();j++)
//			{
//				String str=s1.substring(i,j);
//				if(isPalindrome(str))
//					System.out.println(str);
//			}
//		}
//	}
//}







public class SubStringPalandrome 
{
	public static boolean ispal(String s1)
	{
		int i=0;
		int j=s1.length()-1;
		while(i<=j)
		{
			if(s1.charAt(i) != s1.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String [] args)
	{
		String s1="malayalam";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+3;j<s1.length();j++)
			{
				String str=s1.substring(i,j);
				if(ispal(str))
					System.out.println(str);
			}
		}
	}
}