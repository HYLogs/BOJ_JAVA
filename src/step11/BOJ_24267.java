package step11;

import java.util.Scanner;

public class BOJ_24267 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long n = in.nextLong();
		in.close();
		
		
		// nC3 = n!/(n-3)!*3! = n * (n-1) * (n-2)/6
		System.out.println(n * (n-1) * (n-2)/6 + "\n" + 3);
	}

}
