package Strings;

public class Permutation 
{
	public static void isPermutation(String s1,int st,int end)
	{
		if(st==end)
		{
			System.out.println(s1);
			return;
		}
		for(int i=st;i<=end;i++)
		{
			String s2=swap(s1,st,i);
			isPermutation(s2,st+1,end);
		}
	}
	public static String swap(String s1,int i,int j)
	{
		char []ch=s1.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		
		return new String (ch);
	}
	public static void main(String [] args)
	{
		String s1="abc";
		isPermutation(s1,0,s1.length()-1);
	}
}
