class Solution {
    // find max elements
    private int findMax(int nums[] ){
        int n = nums.length;

        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi , nums[i]);
        }
        return maxi;
    }

    // find total hrs/
    private long calTotal_hr(int nums[] , int h){
        int n = nums.length;
        long total_hrs = 0; 
        for(int i = 0; i < n; i++){
            total_hrs += Math.ceil((double) nums[i] / (double) h);
        }
        return total_hrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length; 
        int low = 1 , high = findMax(piles);

        while(low <= high){
            int mid = (low + high) / 2;
            long totalH = calTotal_hr(piles , mid);

            if(totalH <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
