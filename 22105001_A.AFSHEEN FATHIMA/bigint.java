import java.math.BigInteger;
import java.util.*;
public class bigint {
    public static BigInteger fact(long n){
        if(n<=1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(fact(n-1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(fact(n));
    }
    
}
