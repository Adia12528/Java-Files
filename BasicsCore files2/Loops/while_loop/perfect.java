package while_loop;
import java.util.*;
public class perfect {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a perfect number: ");
            int n = sc.nextInt();
            int i = 1;
            int c = 0;
            while (i < n-1) {
                if(n%i == 0){
                    c = c+i;
                }
                i++;
            }
            if(c == n){
                System.out.println("Is A Perfect Number!");
            }
            else{
                System.out.println("Not a Perfect number!");
            }
        }
    }
}
