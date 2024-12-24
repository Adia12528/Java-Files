package while_loop.pattern;

public class first {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println(" ");
        }
        for (int x = 3; x >= 1; x--) {
            int y = 1;
            while (x >= y) {
                System.err.print(" * ");
                y++;
            }
            System.out.println(" ");
        }
    }
}
