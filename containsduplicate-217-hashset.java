/**
* 217. Contains Duplicate
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

// This is solution is by using a hashset

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
