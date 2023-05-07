package step8;

import java.util.Scanner;

public class BOJ_2745 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		
		int result = 0;
		int len = input[0].length();
		for (int i = 0; i < len; i++) {
			int ch = input[0].charAt(len-(i+1));
			if (ch > 64) {
				result += (ch - 55) * Math.pow(Integer.parseInt(input[1]), i);
			} else {
				result += (ch - '0') * Math.pow(Integer.parseInt(input[1]), i);
			}
		}
		
		System.out.println(result);
		in.close();
	}
}
