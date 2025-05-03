import java.util.*;
public class zerosandones {
    Scanner sc=new Scanner(System.in);
    byte num=sc.nextByte();
    byte a=1;
    while(a<=num){
        num=num^a;
        a=a<<1;
    }
    System.out.print("Integer.toBinaryString"(num));
    
}
