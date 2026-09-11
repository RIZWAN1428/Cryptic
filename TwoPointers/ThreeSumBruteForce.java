import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumBruteForce{
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i< nums.length - 2; i++)
        {
            for(int j=i+1; j<nums.length -1; j++)
            {
                for(int  k=j+1; k< nums.length; k++)
                {
                    if(nums[i]+nums[j]+nums[k] == 0)
                    {   
                        List<Integer> triplet =Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);

                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }

                    }
                }
            }
        }

        return result;
    }

    
}