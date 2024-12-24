package while_loop;

public class odd_number {
    public static void main(String[] args) {
        int i = 1;
        while (i<101) {
            if (i%2 != 0) {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
