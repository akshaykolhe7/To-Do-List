import java.util.*;

public class smallAndLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many number do you want to enter in array");
        int n = sc.nextInt();
        int[] arr = new int[100];

        System.out.println("Enter array Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0], smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i])
                smallest = arr[i];
            if (largest < arr[i])
                largest = arr[i];

        }

        System.out.println("Smallest element is " + smallest);
        System.out.println("largest element is " + largest);
        // System.out.print("largest element is " + getmax(arr, n));
    }
    // public static int getmax(int arr[], int n){
    // if(n==1){
    // return arr[0];
    // }
    // return Math.max(arr[n-1], getmax(arr, n-1));
    // }
}