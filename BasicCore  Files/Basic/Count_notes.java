import java.util.*;

public class Count_notes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input the amount: ");
            int a = sc.nextInt();
            int five_hundered = a / 500;
            int five_hundered_second = a % 500;
            int two_hundered = five_hundered_second / 200;
            int two_hundered_second = two_hundered % 200;
            int one_hundered = two_hundered_second / 100;
            int one_hundered_second = one_hundered % 100;
            int fifty = one_hundered_second / 50;
            int fifty_second = fifty % 50;
            int ten = fifty_second / 10;
            int ten_second = ten % 10;
            int five = ten_second / 5;
            int five_second = five % 5;
            int two = five_second / 2;
            System.out.println("No of 500 notes - "+five_hundered);
            System.out.println("No of 200 notes - "+two_hundered);
            System.out.println("No of 100 notes - "+one_hundered);
            System.out.println("No of 50 notes - "+fifty);
            System.out.println("No of 10 notes - "+ten);
            System.out.println("No of 5 notes - "+five);
            System.out.println("No of 2 notes - "+two);
        }
    }
}
