package Functions;

import java.util.Scanner;

public interface perfect {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            perfect_func(n);
        }
    }
    static void perfect_func(int n){
        int s = 0;
        for (int i = 1; i < n; i++) {
            int r = n%i;
            if (r == 0) {
                s = s + i;
            }
        }
        if (s == n) {
            System.out.println("Is a perfect number!");
        }else{
            System.out.println("Not a perfect number!");
        }
    }
}
