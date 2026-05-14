import java.util.Arrays;
public class Rahul{
    public int findSecondLargest(int[] nums){
        int largest = 0;
        int secLargest = 0;

        if (nums.length<=1) {
            return nums[0];
        }
        for(int i = 0;i<nums.length;i++){
            if (largest<nums[i]) {
                secLargest = largest;
                largest = nums[i];
            }
        }
        return secLargest;
    }

    public int findSecondLargestUsing_Sort(int[] nums) {
        Arrays.sort(nums);
        return nums.length<2 ? nums[nums.length - 1] :  nums[nums.length - 2];
    }

    public static void main(String[] args) {
        Rahul rahul = new Rahul();
        int arr[] = {1,2,4,6,3,2,1,2};
        System.out.println(rahul.findSecondLargest(arr));           // time complexity : O(n)
        System.out.println(rahul.findSecondLargestUsing_Sort(arr)); // time complexity O(n log n)
    }
}