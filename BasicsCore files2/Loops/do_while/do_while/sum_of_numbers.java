package do_while;

public class sum_of_numbers {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        do {
            j = j+i;
            i++;
        } while (i < 11);
        System.out.println("Sum of 1 to 10 = "+j);
    }   
}
