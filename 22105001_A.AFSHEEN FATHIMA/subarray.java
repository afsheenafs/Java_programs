import java.util.*;
class subarray{
    public void model(int arr[],int size,int start,int[] sub){
        if(start==size){
            System.out.print("[");
            for(int i=0;i<size;i++){
                if(sub[i]==1){
                    System.out.print(" "+arr[i]);
                }
            }
            System.out.print(" ]");
        }
        else{
                sub[start]=1;
                model(arr,size,start+1,sub);
                sub[start]=0;
                model(arr,size,start+1,sub);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sub[]=new int[size];
        //int start=0;
        //int index=0;
        subarray obj=new subarray();
        obj.model(arr,size,0,sub);
        }
     }