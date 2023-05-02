package deepen1;

import java.util.Scanner;

public class BOJ_10988 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		int result = 1;
		for (int i=0; i < input.length()/2; i++) {
			int back = input.length() - (i+1);
			if (input.charAt(i) != input.charAt(back)) {
				result = 0;
				break;
			}
		}
		System.out.println(result);
	}
}
