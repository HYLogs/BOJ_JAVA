package String;
import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        int count = 0;
        for (int i = 0; i < input.length(); i++)
        {
            int alpha = input.charAt(i);
            if (alpha >= 'A' && alpha <= 'C') count += 3;
            else if (alpha >= 'D' && alpha <= 'F') count += 4;
            else if (alpha >= 'G' && alpha <= 'I') count += 5;
            else if (alpha >= 'J' && alpha <= 'L') count += 6;
            else if (alpha >= 'M' && alpha <= 'O') count += 7;
            else if (alpha >= 'P' && alpha <= 'S') count += 8;
            else if (alpha >= 'T' && alpha <= 'V') count += 9;
            else count += 10;
        }
        System.out.println(count);
    }
}
