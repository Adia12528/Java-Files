package while_loop;

public class sum_of_numbers {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        while (i < 11) {
            j = j+i;
            i++;
        }
        System.out.println("Sum of 1 to 10 = "+j);
    }   
}
