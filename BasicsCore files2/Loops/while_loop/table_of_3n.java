package while_loop;
import java.util.*;
public class table_of_3n {
    public static void main(String[] args) {
        int i = 3;
        int j = 1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number till you want to print the table of three: ");
            int n = sc.nextInt();
            while (j < n+1) {
                System.out.println(i+" * "+j+" = "+i*j);
                j++;
            }
        }
    }
}
