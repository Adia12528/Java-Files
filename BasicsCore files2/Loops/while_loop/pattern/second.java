package while_loop.pattern;

public class second {
    public static void main(String[] args) {
        for (int x = 7; x >= 1; x--) {
            int y = 1;
            while (x >= y) {
                System.err.print(y+" ");
                y++;
            }
            System.out.println(" ");
        }
    }
}
