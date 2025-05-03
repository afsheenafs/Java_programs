import java.util.*;
public class secmin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int secMin=Integer.MAX_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
            if(arr[i]<min) min=arr[i];
            if(arr[i]<secMin && arr[i]!=min){
                secMin=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(secMax);
        System.out.println(secMin);
        
        }
        }
    

