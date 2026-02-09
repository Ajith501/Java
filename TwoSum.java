// twoSum problem with 2pointer approach with sorted arrays. 
import java.util.Arrays;
public class TwoSum {
    public static boolean twosum(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
            int right = arr.length-1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if(sum == target){
                    return true;
                }
                else if (sum > target){
                    right--;
                }
                else{
                    left++;
                }
            }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 10, 2, 6};
        int target = 8;
        System.out.println(twosum(arr, target));
    }
}
