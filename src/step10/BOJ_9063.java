package step10;

import java.util.Scanner;

public class BOJ_9063 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		
		int first_x = in.nextInt();
		int first_y = in.nextInt();
		int[] xs = new int[] {first_x, first_x};
		int[] ys = new int[] {first_y, first_y};
		
		for (int i = 1; i < count; i++) {
			int x = in.nextInt();
			if (xs[0] > x) xs[0] = x;
			else if (xs[1] < x) xs[1] = x;
			
			int y = in.nextInt();
			if (ys[0] > y) ys[0] = y;
			else if (ys[1] < y) ys[1] = y;
			
		}
		in.close();
		
		System.out.println((xs[1]-xs[0]) * (ys[1]-ys[0]));
	}
}
