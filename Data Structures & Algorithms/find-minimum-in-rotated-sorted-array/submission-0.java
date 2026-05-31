class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0; 
        int high = n -1;
        int min = Integer.MAX_VALUE;


        while(low <= high){
            int mid = low + (high - low) / 2;

            // check left half is sorted?
            if(nums[low] <= nums[mid]){
                min = Math.min(min , nums[low]);

                // eliminate left half 
                low = mid + 1;
            }

            // right half
            else{
                min = Math.min(min , nums[mid]);

                // eliminate right half 
                high = mid - 1;

            }

           
        }
        return min;
    }
}
