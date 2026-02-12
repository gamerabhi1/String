package Strings;

public class DupliateChar {
	public static void main(String[] args) {
		String str="programmer";
		
		char[] ch= str.toCharArray();
		
		System.out.println("Duplicate Character:");
		
		for(int i=0; i<ch.length;i++) {
			if (ch[i]=='0')
			continue;
			
				for(int j=i+1;j<ch.length;j++) {
					if (ch[i]==ch[j]) {
						System.out.println(ch[i]);
						ch[j]=0;
						break;
						
					}	
			}
		}
	}

}
