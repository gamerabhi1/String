package Strings;

//Print the sum of Alphanumeric String
public class AlphaNumeric {

	public static void main(String[] args) {
		String s="Ra2m3a124";
		String s1="";
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
				if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
					s1+=ch;
				}
				if(ch>='0' && ch<='9') {
				
					sum+=ch-'0';
				}
		}
		System.out.println(s1);
		System.out.println(sum);

	}

}
