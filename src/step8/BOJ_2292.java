package step8;
import java.util.*;

public class BOJ_2292 {
    public static void main(String[] args) {
        // My solution
        Scanner sc = new Scanner(System.in);
        Double input = sc.nextDouble();
        sc.nextLine();
        sc.close();

        int i = 1;
        while(true){
            //계차수열을 이용 an = a1 + sum b(n-1) - (bn이 계차수열)
            //sum K = (n+1)n/2, bn = 6n
            int a = 1 + 3*i*(i-1); 
            if ( a >= input ) break; 
            i++;
        }
        System.out.println(i);

        // ** Other solution

        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();
        // sc.nextLine();
        // sc.close();
        
        // int i = 1;
        // while (input > 1){
        //     input -= i*6;
        //     i++;
        // }
        // System.out.println(i);
    }
}
