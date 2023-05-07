package step5;

import java.util.Scanner;

public class BOJ_9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			String in = sc.next();
			Character a = in.charAt(0);
			Character b = in.charAt(in.length()-1);
			System.out.println(Character.toString(a) + Character.toString(b));
		}
		sc.close();
	}
}
