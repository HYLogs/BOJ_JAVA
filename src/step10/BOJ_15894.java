package step10;

import java.util.Scanner;
import java.math.BigInteger;

public class BOJ_15894 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		BigInteger four = new BigInteger("4");
		in.close();
		
		System.out.println(n.multiply(four));
	}
}
