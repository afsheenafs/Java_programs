import java.util.*;
public class arraypath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];

                }

            }
        }
        for(int[] k:arr){
            for(int term:k){
                System.out.print(term+" ");
            }
            System.out.println();
        }
        if(i==row-1||j==col-1){
            
        }
        
    }
}
    

