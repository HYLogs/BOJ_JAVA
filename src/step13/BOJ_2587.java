package step13;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2587 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(arr);
		int median = arr[2];
		int avg = Arrays.stream(arr).sum()/arr.length;
		
		System.out.println(avg + "\n" + median);
	}

}
