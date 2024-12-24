package Functions;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int f = factorial_of_num(n);
            System.out.print("factorial = "+f);
        }
    }
    static int factorial_of_num(int n){
        int i, f = 1;
        for (i = 1; i <= n; i++) {
            f  = f+i;
        }
        return f;
    }
}

