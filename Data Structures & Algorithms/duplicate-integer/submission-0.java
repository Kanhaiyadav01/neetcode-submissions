class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hash = new HashSet<>();

        for(int num : nums){
            if(hash.contains(num)) return true;
            hash.add(num);
        }
        return false;
    }
}