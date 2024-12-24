package for_loop.series;

public class three {
    public static void main(String[] args) {
        int r = 0;
        for (int i = 0; i < 20; i++) {
            if (i%2 != 0) {
                r = i+r;
                System.out.println(r);
            }
        }
    }
}
