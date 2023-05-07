package step6;

import java.util.Scanner;

public class BOJ_4344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCount = in.nextInt();
		in.nextLine();
		
		for (int i = 0; i < testCount; i++) {
			String[] testCase = in.nextLine().split(" ");
			int studentNum = Integer.parseInt(testCase[0]);
			
			float avg = 0;
			for (int j = 1; j < studentNum+1; j++)
				avg += Integer.parseInt(testCase[j]);
			avg /= studentNum;
			
			int count = 0;
			for (int j = 1; j < studentNum+1; j++)
				count += (Integer.parseInt(testCase[j]) > avg) ? 1 : 0;
			
			float result = (float)count/studentNum*100;
			System.out.printf("%.3f%%%n", result);
		}
		in.close();
	}
}
