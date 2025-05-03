import java.io.*;
import java.util.*;
import java.lang.*;
class Searching
{
    public static int binarySearch(int[] arr, int key)
    {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
            {
                return mid;
            }
            else if (arr[mid] < key)
            {
                low = mid + 1;
            }
            else           //    arr [mid] > key
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int limit,i,key;int array[];
        System.out.println("These are Binary Search Process");
        System.out.println("Enter your limit for array : ");
        limit=in.nextInt();
        System.out.println("Condition --> Elements Should be Ascending order !!!");
        array=new int[limit];
        for(i=0;i<limit;i++)
        {
            System.out.println("Enter your Element : ");
            array= new int[]{in.nextInt()};
        }
        System.out.println("Enter your Search Element : ");
        key=in.nextInt();
        int index = binarySearch(array, key);
        if (index==-1)
        {
            System.out.println("Element is found : "+key);
        }
        else
        {
            System.out.println("Element is not found : "+index+" !!!");
        }

        System.out.println("These are Sorting Process");
        System.out.println("Sorting Before time --> 5,4,3,2,1");
        System.out.print("Sorting After time --> ");
        int arr[]=new int[]{5,4,3,2,1};
        for(i=0;i<arr.length;i++)
        {
            int var=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    var=arr[i];
                    arr[i]=arr[j];
                    arr[j]=var;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
