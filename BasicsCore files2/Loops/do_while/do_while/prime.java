package do_while;

public class prime {
    public static void main(String[] args) {
        int i = 0;
        do {
            int j = 1;
            int c = 0;
            do {
                if (i%j == 0) {
                    c++;
                }
                j++;
            } while (j <= i);
            if(c == 2){
                System.out.println(i);
            }
            i++;
        } while (i<=100);
    }
}
