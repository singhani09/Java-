class Palindrome{
	public static void main(String[] args) {
		String s = "hero";
		System.out.println(s);
		char[] ch = s.toCharArray();
		int i = 0 ; int j = ch.length-1;
		while(i<j){
			if (ch[i]!=ch[j]){
				System.out.println("Not a Palindrome");
				return;

			}
			i++;j--;

		}
		System.out.println("Palindrome");
	}
}