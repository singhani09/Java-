

public class Reverse3{
 public static void main(String[] args) {
	String s="malayalam";
	int[] a=new int[127];
	for(char ch:s.toCharArray()) {
		a[ch]++;
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			System.out.println((char)i+"-"+a[i]);
		}
	}
}
}