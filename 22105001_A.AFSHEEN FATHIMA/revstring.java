import java.util.*;
public class revstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int n=s.length;
        int i=0;
        int j=n-1;
        while(i<n/2){
            String temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<n;i++){
            System.out.print(s[i]+" ");

  


        
    }
}
}
    

