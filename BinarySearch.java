import java.util.Scanner;

public class BinarySearch
{
    public static void main(String args[])
    {
        BinarySearch search=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element to be searched:");
        int element=sc.nextInt();
        int result=binarySearch(arr,0,size,element);
        if(result==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at : "+(element-1));
    }
    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}

