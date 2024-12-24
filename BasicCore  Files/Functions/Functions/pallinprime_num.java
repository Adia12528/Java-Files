package Functions;

import java.util.Scanner;

public class pallinprime_num {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            pallinprime(n);
        }
    }
    static void pallinprime(int n){
        int m=n;
        int s = 0;
        while (n != 0) {
            int r = n%10;
            s = s*10+r;
            n = n/10;
        }
        if (s == m) {
            System.out.println("The number is pallinprime!");
        }
        else{
            System.out.println("Is not a pallinprime number!");
        }
        int c = 0;
        for (int i = 1; i <= s; i++) {
            if (s%i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("Is the prime number!");
        }
        else{
            System.out.println("Is not a prime number!");
        }
    }
}

