import java.util.*;

public class centi_farhen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input the temperature in celcius: ");
            float C = sc.nextFloat();
            float F = (C * 9/5) + 32;
            System.out.print("Temperature in Farenheit = "+F);
        }
    }
}
