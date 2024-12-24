package while_loop.pattern;

public class third {
    public static void main(String[] args) {
        int x = 5;
        while (x >= 1) {
            if (x % 2 != 0) {
                for (int i = 1; i <= x; i++) {
                    System.out.println(" * ");
                }
            }else{
                for (int j = 1; j <= x; j++) {
                    System.out.println(" # ");
                }
            }
            x--;
            System.out.println(" ");
        }
    }
}
