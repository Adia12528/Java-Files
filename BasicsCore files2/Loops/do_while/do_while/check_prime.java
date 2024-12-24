package do_while;

import java.util.Scanner;

public class check_prime {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            int c = 0;
            int i = 2;
            do {
                if(n%i == 0){
                    c++;
                }
                i++;
            } while (i < n+1);
            if(c == 1){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println("Not a prime number");
            }
        }
    }
}
