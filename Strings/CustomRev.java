package Strings;
import java.util.Scanner;

public class CustomRev {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s1 = scanner.nextLine();
        int len = s1.length();
        StringBuilder res= new StringBuilder();

        int l=0;
        int r=len-1;
        while (l<r) {
            res.append(s1.charAt(r)); 
            res.append(s1.charAt(l));
            r--;
            l++;
        }
        if (l==r) {
            res.append(s1.charAt(l));
        }
        System.out.println(res.toString());
    }
}