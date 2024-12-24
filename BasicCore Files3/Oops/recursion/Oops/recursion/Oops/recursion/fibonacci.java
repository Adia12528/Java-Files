package Oops.recursion;

public class fibonacci {
    int fibo(int n){
        if (n == 1) {
            return 0;
        }
        else if (n == 2) {
            return 1;                                                                              
        }
        else if (n > 2) {
            return fibo(n-1) + fibo(n-2);
        }
        else{
            return -1;
        }        
    }
    public static void main(String[] args) {
        int i;
        fibonacci f = new fibonacci();
        for (i = 1; i <= 10; i++) {
            int term  = f.fibo(i);
            System.out.println(term  + " ");
        }
    }
}
