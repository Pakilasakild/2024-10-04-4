import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int temp = arr[arr.length-1];
        arr[arr.length-1] = arr[0];
        arr[0] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}