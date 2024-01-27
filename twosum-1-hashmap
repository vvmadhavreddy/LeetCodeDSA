/**
* 1. Two Sum
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
* You can return the answer in any order.
*/

// This solution is using a HashMap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            Integer indexInMap = map.get(nums[i]);
            if(indexInMap != null){
                output[0] = i;
                output[1] = indexInMap;
                return output;
            }
            map.put(target-nums[i], i);
        }
        return output;
    }
}
