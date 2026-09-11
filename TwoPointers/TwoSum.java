import java.util.*;
public class TwoSum{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int need = target - nums[i];

            if(map.containsKey(need))
                return new int[]{map.get(need), i};
            
            map.put(nums[i],  i);
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        int[] nums = {1,3,4,7};
        int target = 5;
        TwoSum d = new TwoSum();
        int[] result = d.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}