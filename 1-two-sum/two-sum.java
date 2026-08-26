class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i =0 ;i<nums.length; i++){
            int need = target -nums[i];
            //check if the needed number was seen before
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            //if not foind , store the current number and its index
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}