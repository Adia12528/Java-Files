package Conditional;

import java.util.Scanner;

public class Charge_for_travelling {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the distance travelled - ");
            int d = sc.nextInt();
            int c = 100;
            if(d < 100){
                System.out.println("Cost of travelling for "+ d +"km - "+c);
            }
            else if(d <= 200){
                System.out.println("Cost of travelling for "+ d +"km - "+(c+5));
            }
            else if (d > 200) {
                System.out.println("Cost of travelling for "+ d +"km - "+(c+10));
            }
            else{
                System.out.println("Invalid Distance!");
            }
        }
    }
}
