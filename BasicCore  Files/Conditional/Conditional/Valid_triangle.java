package Conditional;
import java.util.*;
public class Valid_triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.print("Enter angle one - ");
            int a = sc.nextInt();
            System.err.print("Enter angle two - ");
            int b = sc.nextInt();
            System.err.print("Enter angle three - ");
            int c= sc.nextInt();
            int d = a+b+c;
            if (d == 180){
                System.out.println("Print Triangle is valid");
                if(a == b){
                    System.out.println("A & B are same angle !");
                    if(a > b && a > c){
                        System.out.println("A is greatest !");
                    }
                    else if(b > c && b > a){
                        System.out.println("B is greatest !");
                    }
                    else if(c > a && c > b){
                        System.out.println("C is greatest !");
                    }
                    else if(a < c && a < b){
                        System.out.println("A is smallest !");
                    }
                    else if(b < c && b < a){
                        System.out.println("B is smallest !");
                    }
                    else if(c < b && c < a){
                        System.out.println("C is smallest !");
                    }
                    else{
                        System.out.println("Invalid!");
                    }
                }
                else if(b == c){
                    System.out.println("B & C are same angle !");
                    if(a > b && a > c){
                        System.out.println("A is greatest !");
                    }
                    else if(b > c && b > a){
                        System.out.println("B is greatest !");
                    }
                    else if(c > a && c > b){
                        System.out.println("C is greatest !");
                    }
                    else if(a < c && a < b){
                        System.out.println("A is smallest !");
                    }
                    else if(b < c && b < a){
                        System.out.println("B is smallest !");
                    }
                    else if(c < b && c < a){
                        System.out.println("C is smallest !");
                    }
                    else{
                        System.out.println("Invalid!");
                    }
                }
                else if(c == a){
                    System.out.println("C & A are same angle !");
                    if(a > b && a > c){
                        System.out.println("A is greatest !");
                    }
                    else if(b > c && b > a){
                        System.out.println("B is greatest !");
                    }
                    else if(c > a && c > b){
                        System.out.println("C is greatest !");
                    }
                    else if(a < c && a < b){
                        System.out.println("A is smallest !");
                    }
                    else if(b < c && b < a){
                        System.out.println("B is smallest !");
                    }
                    else if(c < b && c < a){
                        System.out.println("C is smallest !");
                    }
                    else{
                        System.out.println("Invalid!");
                    }
                }else{
                    if(a > b && a > c){
                        System.out.println("A is greatest !");
                        if(a < c && a < b){
                            System.out.println("A is smallest !");
                        }
                        else if(b < c && b < a){
                            System.out.println("B is smallest !");
                        }
                        else if(c < b && c < a){
                            System.out.println("C is smallest !");
                        }
                    }
                    else if(b > c && b > a){
                        System.out.println("B is greatest !");
                        if(a < c && a < b){
                            System.out.println("A is smallest !");
                        }
                        else if(b < c && b < a){
                            System.out.println("B is smallest !");
                        }
                        else if(c < b && c < a){
                            System.out.println("C is smallest !");
                        }
                    }
                    else if(c > a && c > b){
                        System.out.println("C is greatest !");
                        if(a < c && a < b){
                            System.out.println("A is smallest !");
                        }
                        else if(b < c && b < a){
                            System.out.println("B is smallest !");
                        }
                        else if(c < b && c < a){
                            System.out.println("C is smallest !");
                        }
                    }
                    else{
                        System.out.println("Invalid!");
                    }
                }
            }
            else{
                System.out.println("Invalid triangle! ");
            }
        }
    }
}
