public class sumfact {
    public static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
    public static int sumOfDigits(int n){
        if(n<1) return 0;
        return fact(n%10)+sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
    }
}
    

