package Strings;
import java.util.Scanner;
//program to print String is Palindrome or not


public class Palindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		if (isPalindrome(s)){
			System.out.println("String is Palindrome");
		}else {
			System.out.println("Sting is Not palindrome");
		}	
		}
		public static boolean isPalindrome(String s) {
			int i=0;
			int j=s.length()-1;
			while(i<j) {
				if(s.charAt(i)!=s.charAt(j))return false;
				i++;
				j--;
			}
			return true;
		}

}
