package while_loop;

public class prime {
    public static void main(String[] args) {
        int i = 0;
        while (i<=100) {
            int j = 1;
            int c = 0;
            while (j <= i) {
                if (i%j == 0) {
                    c++;
                }
                j++;
            }
            if(c == 2){
                System.out.println(i);
            }
            i++;
        }
    }
}
