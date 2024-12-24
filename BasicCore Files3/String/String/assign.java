package String;

import java.util.Scanner;

public class assign {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the full file name: ");
            String file  =  sc.next();
            int lastIndex = file.lastIndexOf("\\");
            String filePath = file.substring(0, lastIndex);
            String name = file.substring(lastIndex+1);
            String filename = name.substring(0,name.indexOf("."));
            String extension =  name.substring(name.indexOf("."+1));
            System.out.println("FilePath: "+filePath);
            System.out.println("name: "+filename);
            System.out.println("Entension: "+extension);
        }
    }
}
