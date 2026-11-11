// class Reverse1{
// 	public static void main(String[] args) {
// 		String s = "Animesh";
// 		System.out.println(s);
// 		char[]ch = s.toCharArray();
// 		int i = 0 ; int j = ch.length-1;
// 		while(i<j){
// 			char temp = ch[i];
// 			ch[i] = ch[j];
// 			ch[j] = temp;
// 			i++; j--;

// 		}
// 		System.out.println(new String(ch));
// 	}
// }

import java.util.Scanner;
class Reverse1{
	
		static void input(String s){
		
		char[]ch = s.toCharArray();
		int i = 0 ; int j = ch.length-1;
		while(i<j){
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++; j--;

		}
		System.out.println(new String(ch));
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	input(s);


}
}



