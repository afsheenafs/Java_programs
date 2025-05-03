public class SubarraysTwoPointers {
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            System.out.print("[");
            int end = start;
            while(end<n){
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i]);
                    end++;
                    if (i < end) System.out.print(", ");
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printAllSubarrays(arr);
    }
}