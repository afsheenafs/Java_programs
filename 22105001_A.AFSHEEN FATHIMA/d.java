import java.util.*;
class d {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] k:arr){
            for(int term:k){
                System.out.print(term+" ");
            }
            System.out.println();
        }
        for(int[] k:arr){
            for(int term:k){
                System.out.print(term+" ");
            }
            System.out.println();
        }
       
    
}
}
