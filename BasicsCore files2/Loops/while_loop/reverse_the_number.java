package while_loop;
import java.util.*;
public class reverse_the_number {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the digit: ");
            int n = sc.nextInt();
            int r;
            int s = 0;
            while (n > 0) {
                r = n%10;
                s = (s*10) + r;
                n = n/10;
            }
            System.out.println(s);
        }
    }
}
