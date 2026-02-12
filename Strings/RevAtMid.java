package Strings;

public class RevAtMid {

		public static String rev(String s1)
		{
			int mid=s1.length()/2;
			int i=0;
			int j=mid;
			String s2="";
			while(i<mid)
			{
				while(i>=0 && i!=mid)
				{
					i++;
				}
				int k=i-1;
				while(k>=0)
				{
					s2+=s1.charAt(k);
					k--;
				}
			}
			while(j<s1.length())
			{
				s2+=s1.charAt(j);
				while(j>=mid && j<s1.length())
				{
					j++;
				}
				int k=j-1;
				while(k>mid)
				{
					s2+=s1.charAt(k);
					k--;
				}
			}
			return s2;
		}
		public static void main(String [] args)
		{
			String s1="Abhishek";
			System.out.println(rev(s1));
		}
}

