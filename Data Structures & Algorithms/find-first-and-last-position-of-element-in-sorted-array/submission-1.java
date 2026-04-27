class Solution {

    private int lowerBound(int nums[] , int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private int upperBound(int nums[] , int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] > target){
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int firstOcc = lowerBound(nums , target);

        if(firstOcc == nums.length || nums[firstOcc] != target)
            return new int[]{-1 , -1}; 

        int lastOcc = upperBound(nums , target) - 1;

        return new int[]{firstOcc , lastOcc}; 
    }
}