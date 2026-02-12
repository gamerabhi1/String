package Strings;

public class LongestSubString {
	
	//public class LongestSubStringPalindrome 
	//{
//		public static boolean isPalindrome(String s1)
//		{
//			int i=0;
//			int j=s1.length()-1;
//			while(i<j)
//			{
//				if(s1.charAt(i)!=s1.charAt(j))
//				{
//					return false;
//				}
//				i++;
//				j--;
//			}
//			return true;
//		}
//		public static void main(String [] args)
//		{
//			String s1="malayalam";
//			int count=0;
//			String s2="";
//			for(int i=0;i<s1.length();i++)
//			{
//				for(int j=i+3;j<s1.length();j++)
//				{
//					String str=s1.substring(i,j);
//					if(isPalindrome(str))
//					{
//						if(str.length()>count)
//						{
//							count=str.length();
//							s2=str;
//						}
//						
//					}
//				}
//			}
//			System.out.println(s2);
//		}
	//}











	//public class LongestSubStringPalindrome 
	//{
//		public static boolean ispal(String s1)
//		{
//			int i=0;
//			int j=s1.length()-1;
//			while(i<=j)
//			{
//				if(s1.charAt(i) !=s1.charAt(j))
//					return false;
//				i++;
//				j--;
//			}
//			return true;
//		}
//		public static void main(String [] args)
//		{
//			String s1="malayalam";
//			int count=0;
//			String s2="";
//			for(int i=0;i<s1.length();i++)
//			{
//				for(int j=i+3;j<s1.length();j++)
//				{
//					String str=s1.substring(i,j);
//					if(ispal(str))
//					{
//						if(str.length()>count)
//						{
//							count=str.length();
//							s2=str;
//						}
//					}
//				}
//			}
//			System.out.println(s2);
//		}
	//}


		public static boolean ispal(String s1)
		{
			int i=0;
			int j=s1.length()-1;
			while(i<=j)
			{
				if(s1.charAt(i)!=s1.charAt(j))
					return false;
				i++;
				j--;
				
			}
			return true;
		}
		public static void main(String [] args)
		{
			String s1="malyalam";
			if(ispal(s1))
				System.out.println("palandrome");
			else
				System.out.println("not");
	}

}
