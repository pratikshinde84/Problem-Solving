public class a {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1,min=nums[0];
        while(start<end){
            int mid=start+(end-start)/2;
            min=Math.min(min,nums[mid]);
            if(nums[mid]<nums[end]){
                end=mid;
            }else if(nums[mid]>nums[end]){
                start=mid+1;
            }//4,5,6,7,0,1,2
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(new a().findMin(new int[]{4,5,6,7,0,1,2}));
    }
}