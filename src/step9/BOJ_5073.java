package step9;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_5073{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] arr = new int[3];
		
		while(true) {
			arr[0] = in.nextInt();
			arr[1] = in.nextInt();
			arr[2] = in.nextInt();
			
			if (arr[0] == 0) break;
			
			Arrays.sort(arr);
			
			if (arr[2] >= (arr[0] + arr[1])) System.out.println("Invalid");
			else if (arr[0] == arr[1] && arr[1] == arr[2]) System.out.println("Equilateral");
			else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) System.out.println("Isosceles");
			else System.out.println("Scalene");
		}
		in.close();
	}

}
