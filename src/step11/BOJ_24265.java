package step11;

import java.util.Scanner;

public class BOJ_24265 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long n = in.nextLong();
		in.close();
		
		Long count = 0L;
		for (int i = 1; i < n; i++)
			count += n-i;
		
		System.out.println(count + "\n" + 2);
	}

}
