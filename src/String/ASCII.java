package String;
import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int ascii = (int)(sc.nextLine().charAt(0));
        System.out.println(ascii);
        sc.close();
    }
}
