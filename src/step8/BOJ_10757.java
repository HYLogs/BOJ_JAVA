package step8;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_10757 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger A = in.nextBigInteger();
		BigInteger B = in.nextBigInteger();
		in.close();
		
		System.out.println(A.add(B));
	}
}
