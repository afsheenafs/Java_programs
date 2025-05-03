import java.util.Scanner;
public class factors {
    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            for(int num:arr){
            int factorCount = countFactors(num);
            System.out.print(factorCount);
        }
    }
    }
}


