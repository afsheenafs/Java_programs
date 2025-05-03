import java.util.*;
public class operator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        byte a=sc.nextByte();
        byte b=sc.nextByte();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(a^b);
        System.out.println(a<<1);
        System.out.println(a>>1);
        System.out.println(b<<1);
        System.out.println(b>>1);


    }
    
}
