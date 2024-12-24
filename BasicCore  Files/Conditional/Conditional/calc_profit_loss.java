package Conditional;

import java.util.Scanner;

public class calc_profit_loss {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int sell = sc.nextInt();
            int buy = sc.nextInt();
            if(sell == buy){
                System.out.println("No profit no loss !");
            }
            else if(sell > buy){
                System.out.println("Profit !");
            }
            else{
                System.out.println("Loss !");
            }
        }
    }
}
