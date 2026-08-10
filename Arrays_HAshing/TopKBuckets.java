import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKBuckets {
    public int[] topKBucket(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();

        // 1. Count frequencies first
        for (int num : nums) {
            if (!map.containsKey(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }

        // 2. Create buckets
        List<Integer>[] buckets = new List[nums.length + 1];


        // 3. Put numbers into frequency buckets
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(buckets[freq] == null)
                buckets[freq] = new ArrayList<>();

            buckets[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;
        for(int freq = buckets.length -1; freq>=0; freq--)
        {
            if(buckets[freq] != null)
            {
                for(int num : buckets[freq])
                {
                    result[index] =  num;
                    index++;

                    if(index == k)
                        return result;
                }
            }
        }

        return result;
    }

     public static void main(String[] args) {
        
        int[] nums = {1,2,2,2,3,3,3,3,4};
        int k = 3;
        TopKBuckets t = new TopKBuckets();

        int[] result = t.topKBucket(nums, k);
        System.out.println(Arrays.toString(result));

    }
}
