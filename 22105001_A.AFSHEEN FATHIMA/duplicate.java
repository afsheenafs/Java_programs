import java.util.*;
public class duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
    
    

