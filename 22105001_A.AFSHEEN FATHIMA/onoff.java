import java.util.*;
public class onoff {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        byte num=sc.nextByte();
        if((num &1)==0){
            System.out.println("OFF");
        }
        else{
            System.out.println("ON");
        }
        if((num& 1<<7)==0){
            System.out.println("OFF");

        }
        else{
            System.out.println("ON");
        }
    }
    
}

