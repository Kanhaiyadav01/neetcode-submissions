class Solution {

    private int findIdx(int nums[] ,int low , int high , int t ){
        int n = nums.length; 
        if(low > high) return -1;

        int mid = (low + high) / 2;

        int idx;

        if(nums[mid] == t){
           idx = mid;
        }
        else if(nums[mid] < t){
            idx = findIdx(nums , mid+1 , high , t);
        }
        else{
            idx = findIdx(nums , low , mid-1 , t);
        }
        return idx;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return findIdx(nums , 0 , n-1 , target);
    }
}
