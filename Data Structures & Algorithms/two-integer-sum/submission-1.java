class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> mpp = new HashMap<>();
        
        // Size of the nums array
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Current number in the array
            int num = nums[i];
            
            // Number needed to reach the target
            int moreNeeded = target - num;

            // Check if the complement exists in map
            if (mpp.containsKey(moreNeeded)) {
                /* Return the indices of the two
                numbers that sum up to target*/
                return new int[]{mpp.get(moreNeeded), i};
            }

            // Store current number and its index in map
            mpp.put(nums[i], i);
        }

        // If no such pair found, return {-1, -1}
        return new int[]{-1, -1};
    }
}
