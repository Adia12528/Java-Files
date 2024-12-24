import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[][] = new int[3][3];
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print("Enter the element = ");
                    arr[i][j] = sc.nextInt(); 
                }
            }
            int x = 0;
            int y = 0;
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print(arr[i][j]+" ");
                    if (arr[i][j] % 2 == 0) {
                        x++;
                    }
                    else{
                        y++;
                    }
                }
                System.out.println();
            }
            System.out.println(x+" number of even!");
            System.out.println(y+" number of odd!");
        }
    }
}
