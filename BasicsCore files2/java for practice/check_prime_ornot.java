import java.util.Scanner;

public class check_prime_ornot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to check weather it is prime or not: ");
            int n = sc.nextInt();
            int c = 0;
            for (int j = 1; j <= n; j++) {
                if(n % j == 0){
                    c++;
                }
            }
            if (c == 2) {
            System.out.println(n+" is a prime a number!");
            }
            else{
                System.out.print("Not a prime number!");
            }
        }
    }
}
