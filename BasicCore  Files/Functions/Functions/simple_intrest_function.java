package Functions;
import java.util.*;
public class simple_intrest_function {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input number to calculate simple intrest: ");
            int p = sc.nextInt();
            int r = sc.nextInt();
            int t = sc.nextInt();
            int si = simple_intrest(p, r, t);
            System.out.println("The simple intrest = "+si);
        }
    }
    static int simple_intrest(int p,int r,int t){
        int n = +(p*r*t)/100;
        return n;
    }
}
