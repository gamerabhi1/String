package Strings;
// Remove Duplicate Word from the Given String
public class RemoveWord {

	public static void main(String[] args) {
		String s="Madam sir Madam sir";
		String[] str=s.split(" ");
		
		for(int i=0;i<str.length;i++) {
			if(str[i]=="")continue;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					str[i]="";
				}
			}
			System.out.print(str[i]+" ");
		}

	}

}
