

public class Sample1 {


	public static void main(String[] args) {
		
	
	String str="aabbcabbd";
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length-1;i++) {
		if(ch[i]!=ch[i+1]) {
			System.out.print(ch[i]);
		}
	}
	
System.out.print(ch[ch.length-1]);
}


}