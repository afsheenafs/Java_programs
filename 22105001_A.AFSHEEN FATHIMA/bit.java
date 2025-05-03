import java.util.*;
public class bit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=31;i>=0;i--){
            int bit=(n>>i)&1;
            System.out.print(bit);
        }
        
    }
    
}
