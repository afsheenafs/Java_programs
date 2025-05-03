import java.util.Scanner;
class rotation{
void rotationarr(int[] arr, int start,int end){
    int temp=0,j=n-1;
for(int i=start;i<end/2;i++){
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    j--;
}
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rotation=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int temp=0,j=n-1;
for(int i=0;i<n/2;i++){
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    j--;
}
rotation=rotation%n;
rotation obj=new rotation();
obj.rotation(arr,0,n-1);
obj.rotation(arr,0,rotation-1);
obj.rotation(arr,rotation,n-1);
for(int i=0;i<n;i++){
    System.out.println(arr[i]);
}

}
}

   
   