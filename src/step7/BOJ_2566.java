package step7;

import java.util.Scanner;

public class BOJ_2566 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 9;
		
		int max = Integer.MIN_VALUE;
		int input, index = 0;
		
		for (int i = 0; i < n*n; i++) {
			input = in.nextInt();
			if (max < input) {
				max = input;
				index = i;
			}
		}
		
		int row = (index/n)+1;
		int column = (index%n)+1;
		
		System.out.println(max + "\n" + row + " " + column);
		
	}
}
