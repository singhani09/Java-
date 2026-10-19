

public class Reverse2{
	public static void main(String[] args) {
		String s = "malayalam";
		int[] a = new int[127];
		for (char ch : s.toCharArray()) {
			a[ch]++;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]==1) {
				System.out.print((char) i + " ");
			}
		}
	}
}