package step1;

import java.util.Scanner;

public class BOJ_1008 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();

        System.out.print(String.format("%.9f", a/b));
        in.close();
    } 
}
