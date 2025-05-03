import java.util.*;
public class zeroandone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        byte byteValue=(byte) num;
        int countOne=0;
        int countZero=0;
        for(int i=0;i<8;i++){
            if((byteValue & (1<<i))!=0){
                countOne++;

            }
            else{
                countZero++;
            }
        }
        System.out.println(countOne);
        System.out.println(countZero);

        


    }
}
    

