package Strings;

public class CharCount {

	public static void main(String[] args) {
		String s="1AbcD@5!&8CSf#25";
		int uc=0;
		int lc=0;
		int nc=0;
		int sc=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				uc++;
				}else if (ch>='a' && ch<='z') {
					lc++;	
				}else if (ch>='0' && ch<='9') {
					nc++;
				}else {
					sc++;
			}
		}	
		System.out.println("uc="+uc);
		System.out.println("lc="+lc);
		System.out.println("nc="+nc);
		System.out.println("sc="+sc);
	}

}
