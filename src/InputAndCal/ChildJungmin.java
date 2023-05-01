package InputAndCal;

import java.math.BigInteger;
import java.util.Scanner;

public class ChildJungmin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();
		sc.nextLine();
		sc.close();
		
		System.out.println(a.add(b).add(c));
	}
}
