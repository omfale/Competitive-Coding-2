import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int number = target - nums[i];

            if(map.containsKey(number))
            {
                return new int[] {i,map.get(number)};
            }

            map.put(nums[i],i);

        }

        return new int[] {};
    }
}