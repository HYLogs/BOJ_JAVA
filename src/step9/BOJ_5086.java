package step9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BOJ_5086 {
	public static void main(String[] args) throws FileNotFoundException {
		// input .txt file
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a == 0 && b == 0) break;
			
			if ( a < b && b%a==0)
				sb.append("factor");
			else if ( a > b && a%b == 0)
				sb.append("multiple");
			else
				sb.append("neither");
			sb.append("\n");
		}
		
		in.close();
		System.out.println(sb);
	}
}
