class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int compliment = 0;
        for(int i = 0; i < len; i++){
            compliment = target - nums[i];
            if(map.containsKey(compliment)) return new int[] {map.get(compliment),i};
            else map.put(nums[i], i);
        }
        return new int[] {};
    }   
}
