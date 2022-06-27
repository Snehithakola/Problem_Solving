import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        int j,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to be searched");
        int x = sc.nextInt();
        for (j = 0; j < n; j++) {
            if (arr[j] == x) {
                flag = 1;
                System.out.println("Element found");
                break;
            }
            if(flag==0)
                System.out.println("Element not found");

        }
    }
}
