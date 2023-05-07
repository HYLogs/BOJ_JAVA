package step6;
import java.util.*;

public class BOJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        input = input.replaceAll("c=", "A");
        input = input.replaceAll("c-", "A");
        input = input.replaceAll("dz=", "A");
        input = input.replaceAll("d-", "A");
        input = input.replaceAll("lj", "A");
        input = input.replaceAll("nj", "A");
        input = input.replaceAll("s=", "A");
        input = input.replaceAll("z=", "A");
        System.out.println(input.length());
    }
}
