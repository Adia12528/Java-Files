package do_while;

public class odd_number {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i%2 != 0) {
                System.out.print(i+" ");
            }
            i++;
        } while (i<101);
    }
}
