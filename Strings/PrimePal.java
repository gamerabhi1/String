package Strings;

public class PrimePal {

	public static void main(String[] args) {
	int n=11;
	
	if(isPrime(n,n/2)==true && isPal(n,0)==n)
		System.out.println("the No is Prime Pallindrome"
				+ "");

	}
	
	static boolean isPrime(int n,int i)
	{
		if(i==1)
			return true;
		
		if(n<=1 ||n%i==0)
			return false;
		
		return isPrime(n,i-1);
	}
	
	static int isPal(int n,int rev)
	{
		if(n==0)
			return rev;
		rev=(rev*10)+n%10;
		return isPal(n/10,rev);
	}

}
