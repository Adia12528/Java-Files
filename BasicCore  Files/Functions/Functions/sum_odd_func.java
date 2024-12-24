package Functions;

import java.util.Scanner;

public class sum_odd_func {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Sum_of_odd(n);
        }
    }
    static void Sum_of_odd(int n){
        int s = 0;
        while (n != 0) {
            int r = n%10;
            if (r%2 != 0) {
                s = s + r;
            }
            n = n/10;
        }
        System.out.println("Sum of odd digitd if the number is "+s);
    }
}
