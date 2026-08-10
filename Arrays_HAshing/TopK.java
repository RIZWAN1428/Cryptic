import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopK {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            if(!map.containsKey(num))
            {
                map.put(num,1); 
                
            }
            else
            {
                map.put(num,map.get(num)+1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue()); 

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
            pq.add(entry);

        int[] result = new int[k];
        for(int i=0; i<k; i++)
            result[i] = pq.poll().getKey();

        return result;
    }

    public static void main(String[] args) {
        
        int[] nums = {1,2,2,2,3,3,3,3,4};
        int k = 3;
        TopK t = new TopK();

        int[] result = t.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));

    }
}
