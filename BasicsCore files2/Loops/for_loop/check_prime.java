package for_loop;
import java.util.*;
public class check_prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            int c = 0;
            for(int i = 2; i < n+1; i++){
                if(n%i == 0){
                    c++;
                }
            }
            if(c == 1){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println("Not a prime number");
            }
        }
    }
}
