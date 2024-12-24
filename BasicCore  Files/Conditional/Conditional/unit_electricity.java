package Conditional;

import java.util.*;

public class unit_electricity {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter unit of electricity used - ");
            int u = sc.nextInt();
            if(u < 100){
                System.out.println("No charges cost !");
            }
            else{
                int b = (u - 100) * 10;
                System.out.println("Exceed charge of unit - "+b);
            }
        }
    }
}
