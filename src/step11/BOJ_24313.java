package step11;

import java.util.Scanner;

public class BOJ_24313 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt();
		int a0 = in.nextInt();
		int c = in.nextInt();
		int n0 = in.nextInt();
		in.close();
		
		if ((a1*n0 + a0) <= (c*n0) && a1 <= c)
			System.out.println(1);
		else
			System.out.println(0);
	}

}
