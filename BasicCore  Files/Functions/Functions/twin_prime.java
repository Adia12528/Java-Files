package Functions;

public class twin_prime {
    public static void main(String[] args) {
        int n = 100;
        prime_twin(n);
    }
    
    static void prime_twin(int n) {
        for (int i = 1; i <= n; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    c=c+1;
                }
            }
            if (c==2) {
                System.out.print("prime nos. between 1 to 100 are: ");
                System.out.println(i);
            }
            // System.out.println("The twin prime number between 1 to 100: ");
        }
    }
}
// incomplete ..............................................................................