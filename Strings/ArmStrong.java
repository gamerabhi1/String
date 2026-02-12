package Strings;

public class ArmStrong 
{
	public static void main(String[] args) {
		int n=153;
		int c=count(n);
		int sum=isArm(n,c);
				
				if(sum==n)
					System.out.println("Armstrong NUmber");
				else
					System.out.println("not a ArmStrong No");
	}
	
	static int count(int n)
	{
		if(n==0)
			return n;
		return 1+(n/10);
	}
	
	static int isArm(int n,int c)
	{
		if(n==0)
			return n;
		return (int )Math.pow(n%10, c)+isArm(n/10,c);
	}

}
