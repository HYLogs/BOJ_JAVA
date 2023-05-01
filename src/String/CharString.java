package String;

import java.util.Scanner;

public class CharString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int i = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		System.out.println(S.charAt(i-1));
	}
}
