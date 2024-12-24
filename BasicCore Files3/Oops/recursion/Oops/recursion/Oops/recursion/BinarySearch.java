package Oops.recursion;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    private int[] arr;
    private int n;
    private static Scanner sc = new Scanner(System.in);
    
    public BinarySearch(int nn) {
        n = nn;
    }
    
    public void fillArray() {
        arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    
    public void sort() {
        Arrays.sort(arr);
    }
    
    public int bin_search(int v) {
        int l = 0;
        int u = n - 1;
        
        while (l <= u) {
            int m = l + (u - l) / 2;
            
            if (arr[m] == v) {
                return m; // Element found, return index
            } else if (arr[m] < v) {
                l = m + 1; // Search in the right half
            } else {
                u = m - 1; // Search in the left half
            }
        }
        
        return -1; // Element not found
    }
    
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch(5); // Example: Create instance for an array of size 5
        bs.fillArray();
        bs.sort();
        
        System.out.println("Sorted Array: " + Arrays.toString(bs.arr));
        
        System.out.println("Enter value to search:");
        int value = sc.nextInt();
        
        int index = bs.bin_search(value);
        if (index != -1) {
            System.out.println("Element " + value + " found at index " + index);
        } else {
            System.out.println("Element " + value + " not found in the array");
        }
    }
}