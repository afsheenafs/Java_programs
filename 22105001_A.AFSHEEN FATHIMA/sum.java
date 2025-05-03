import java.util.*;
public class sum {
    static int sum=0;
    public static int sum(int n){
        sum=sum+n;
        n++;
        if(n<=5){
            return sum(n);
        }
        else return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sum(n));
    }
}
    

