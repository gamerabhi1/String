package Strings;

public class AutoMorphic {

	public static void main(String[] args) {
		int n=5;
		int sq=n*n;
		boolean flag=true;
		while(n!=0)
		{
			if(n%10 !=sq%10)
			{
				flag=false;
				break;
			}
			n=n/10;
			sq=sq/10;
		}
		
		if(flag)
		{
			System.out.println("automorphic");
		}
		else
			System.out.println("not automorphic");

	}

}
