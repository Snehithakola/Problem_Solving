import java.util.Scanner;

public class FindMax {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int j=1;j<n;j++)
          if(arr[j]>max)
              max=arr[j];
        System.out.print("largest value is " +max);
    }
}
